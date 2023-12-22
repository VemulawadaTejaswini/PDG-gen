import java.util.*;
import java.lang.Math;

public class Main{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] s = new int[n];
			double m = 0;
			double alpha = 0;
			for(int i = 0; i < n; i++){
				s[i] = sc.nextInt();
				m += s[i];
			}
			m /= n;
			for(int i = 0; i < n; i++){
				alpha += Math.pow(s[i]-m,2);
			}
			alpha /= n;
			alpha = Math.sqrt(alpha);
			System.out.println(alpha);
		}
	}
}