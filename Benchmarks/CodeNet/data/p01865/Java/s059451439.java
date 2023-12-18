import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt() * sc.nextInt();
        }
        
        sum *= -1;
        
        long d = -1;
        long r = -1;
        d = sum / (50000);
        r = sum % (50000);
        
        if (sum != 0) {
            int ans = 1;
            if (r < 0) {
                ans = -1;
                r *= -1;
            }
            
            System.out.println(1 + d);
            System.out.println(ans + " " + r);
            for (int i = 0; i < d; i++) {
                System.out.println(ans + " " + 50000);
            }
        } else {
            System.out.println(0);
        }
    }
    
    public static long lcd(long a, long b) {
        return (a*b)/gcd(a,b);
    }

    public static long gcd(long a, long b) {
        if (a == b) return a;
        if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
    
    public static void calc() {
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long e = sc.nextInt();
        long f = sc.nextInt();
        
        // x?????????????§£???
        long k = Math.abs(b)*Math.abs(e)/gcd(Math.abs(b), Math.abs(e));
        long ax = (k/Math.abs(b)) * a;
        long cx = (k/Math.abs(b)) * c;
        long dx = (k/Math.abs(e)) * d;
        long fx = (k/Math.abs(e)) * f;
        float x;
        if (b*e >= 0) {
            x = (cx-fx)/(ax-dx);
        } else {
            x = (cx+fx)/(ax+dx);
        }
        
        // y?????????????§£???
        k = Math.abs(a)*Math.abs(d)/gcd(Math.abs(a), Math.abs(d));
        long by = (k/Math.abs(a)) * b;
        long cy = (k/Math.abs(a)) * c;
        long ey = (k/Math.abs(d)) * e;
        long fy = (k/Math.abs(d)) * f;
        float y;
        if (a*d >= 0) {
            y = (cy-fy)/(by-ey);
        } else {
            y = (cy+fy)/(by+ey);
        }
        
        System.out.println(String.format("%.3f",x) + " " + String.format("%.3f",y));
    }
}