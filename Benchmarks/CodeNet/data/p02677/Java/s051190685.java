import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();
        int M = sc.nextInt();

	    double Time = Math.abs((H * 5) + (M / 12) - M);
        double kaku = Time * 6;
        if(kaku > 180){
            kaku = 360 - kaku;
        }

        if(kaku == 0) {
            int tmp = Math.abs(A - B);
            System.out.println(tmp);
        } else if(kaku == 180) {
        	System.out.println(A + B);
        } else {
	        double cos = Math.cos(Math.toRadians(kaku));
	        double ans = (A * A) + (B * B) - (2 * A * B * cos);
	        System.out.println(Math.sqrt(ans));
        }
    }
}
