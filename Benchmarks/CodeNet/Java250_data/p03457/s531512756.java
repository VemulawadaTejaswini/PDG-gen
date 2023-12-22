import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;


public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int[] tm = new int[n];
			int[] x = new int[n];
			int[] y = new int[n];
			int[] tmdst = new int[n];
			int[] dst = new int[n];
			int trfls = 0;
			for (int i = 0; i < n; i++) {
				tm[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					tmdst[i] = tm[0];
					dst[i] = Math.abs(x[i])+Math.abs(y[i]);
				}else{
					tmdst[i] = tm[i] - tm[i-1];
					dst[i] = Math.abs(x[i]-x[i-1])+Math.abs(y[i]-y[i-1]);
				}
			}
			for (int i = 0; i < n; i++) {
				if (traveling(dst[i],tmdst[i]) == true) {
					continue;
				}else{
					trfls++;
				}
			}
			if(trfls == 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

		    sc.close(); }
	
	public static boolean traveling(int dst , int tmdst) {
		if (dst <= tmdst && (tmdst - dst) % 2 ==0 ) {
			return true;
		}else{
			return false;
		}
	}

}
