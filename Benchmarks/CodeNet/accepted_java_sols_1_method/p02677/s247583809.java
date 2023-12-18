import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double ans = 0;
        double hh = h * 30 + 0.5 * m;
        double mm = 6 * m;
        double hm = (double)Math.abs(hh - mm);
        double cos = (double)Math.cos(Math.toRadians(hm));
        ans = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * cos;
        System.out.println(Math.sqrt(ans));
    }
}