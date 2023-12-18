import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    class P {
        double x, y;
        
        P(double x_, double y_) {
            x = x_;
            y = y_;
        }
        
        P add(P p) {
            return new P(x + p.x, y + p.y);
        }
        
        P sub(P p) {
            return new P(x - p.x, y - p.y);
        }
        
        P mul(double v) {
            return new P(x * v, y * v);
        }
        
        P div(double v) {
            return new P(x / v, y / v);
        }
        
        double dot(P p) {
            return x * p.x + y * p.y;
        }
        
        double det(P p) {
            return x * p.y - y * p.x;
        }
        
        double abs2() {
            return x * x + y * y;
        }
        
        double abs() {
            return Math.sqrt(abs2());
        }
        
        P norm() {
            return div(abs());
        }
        
        P rot90() {
            return new P(-y, x);
        }
        
        P proj(P src, P dst) {
            P p_sd = dst.sub(src).norm();
            return src.add(p_sd.mul(sub(src).dot(p_sd)));
        }
        
        P reflect(P src, P dst) {
            P middle = proj(src, dst);
            return add(middle.sub(this).mul(2));
        }
        
        public String toString() {
            return String.format("%f %f", x, y);
        }
    }
    
    P isLL(P p1, P p2, P q1, P q2) {
        double d = p2.sub(p1).det(q1.sub(q2));
        if(Math.abs(d) < 1e-10) return null;
        return p1.add(p2.sub(p1).mul(q1.sub(q2).det(p1.sub(q2)) / d));
    }
    
    boolean intersect(P p1, P p2, P q1, P q2) {
        return Line2D.linesIntersect(p1.x, p1.y, p2.x, p2.y, q1.x, q1.y, q2.x, q2.y);
    }
    
    double distSS(P p1, P p2, P q1, P q2) {
        if(intersect(p1, p2, q1, q2)) return 0;
        
        double dist = Double.MAX_VALUE;
        for(double d : new double[] {distSP(p1, p2, q1), distSP(p1, p2, q2), 
                                     distSP(q1, q2, p1), distSP(q1, q2, p2)}) {
            dist = Math.min(d, dist);
        }
        return dist;
    }
    
    double distSP(P p1, P p2, P p) {
        return Line2D.ptSegDist(p1.x, p1.y, p2.x, p2.y, p.x, p.y);
    }
    
    void run() {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        while(q-- > 0) {
            P p1 = new P(sc.nextDouble(), sc.nextDouble());
            P p2 = new P(sc.nextDouble(), sc.nextDouble());
            P q1 = new P(sc.nextDouble(), sc.nextDouble());
            P q2 = new P(sc.nextDouble(), sc.nextDouble());
            
            System.out.println(distSS(p1, p2, q1, q2));
        }
    }
    
    public static void main(String[] args) {
        new Main().run();
    }
    
    static void tr(Object... objects) {
        System.out.println(Arrays.deepToString(objects));
    }
}
