import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x = n / 1.08;
//		System.out.println("" + x);
		double xx1 = Math.floor(x);
        double xx2 = xx1 + 1;
//		System.out.println("" + xx);
		double nn1 = Math.floor(xx1 * 1.08);
		double nn2 = Math.floor(xx2 * 1.08);
//		System.out.println("" + nn);
        if (n == nn1) System.out.println("" + (int)xx1);
        else if (n == nn2) System.out.println("" + (int)xx2);
        else System.out.println(":(");
    }
}