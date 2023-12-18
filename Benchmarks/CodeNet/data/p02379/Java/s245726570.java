import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double[] lengthIndex = new double[4];
        for(int i = 0; i < lengthIndex.length; i++){
            lengthIndex[i] = sc.nextDouble();
        }
        
        Point pt1 = new Point();
        pt1.setXPoint(lengthIndex[0]);
        pt1.setYPoint(lengthIndex[1]);
        
        double px1 = pt1.getXPoint();
        double py1 = pt1.getYPoint();
        
        Point pt2 = new Point();
        pt2.setXPoint(lengthIndex[2]);
        pt2.setYPoint(lengthIndex[3]);
        
        double px2 = pt2.getXPoint();
        double py2 = pt2.getYPoint();
        
        double ans = Math.sqrt(Math.pow((px2-px1), 2) + Math.pow((py2-py1), 2));
        System.out.println(ans);
    }
}

class Point{
    private double x;
    private double y;
    
    public void setXPoint(double x){
        this.x = x;
    }
    
    public double getXPoint(){
        return x;
    }
    
    public void setYPoint(double y){
        this.y = y;
    }
    
    public double getYPoint(){
        return y;
    }
}
