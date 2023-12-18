import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		System.out.println(calcD(x, y, 1));
		System.out.println(calcD(x, y, 2));
		System.out.println(calcD(x, y, 3));
		System.out.println(calcD(x, y, Double.POSITIVE_INFINITY));
	}

	public static double calcD(int[] x, int[] y, double p){
		if(p == Double.POSITIVE_INFINITY){
			double max = 0;
			for(int i = 0; i < x.length; i++){
				max = Math.max(max,Math.abs(x[i] - y[i]));
			}
			return max;
		} else{
			double sig = 0;
			for(int i = 0; i < x.length; i++){
				sig += Math.pow(Math.abs(x[i] - y[i]), p);
			}
			double d = Math.pow(sig, 1 / p);
			return d;
		}
	}
}