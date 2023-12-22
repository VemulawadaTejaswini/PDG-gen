import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        if(a == 1) a = 9;
        else a = 1;
        if(b == 1) b = 9;
        else b = 1;
        if(c == 1) c = 9;
        else c = 1;
        System.out.println(c*100+b*10+a);
    }
    public static int min(int a, int b) {
        if(a <= b) return a;
        else return b;
    }
    public static int max(int a, int b) {
        if(a <= b) return b;
        else return a;
    }
    public static int saiyaku(int a, int b) {
        if(a < b) return saiyaku(b, a);
        if(b == 0) return a;
        int w = b;
        a = a % b;
        b = w;
        return saiyaku(a, b);
    }
}