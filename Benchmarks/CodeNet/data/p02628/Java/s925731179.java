import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int loo = inputs.nextInt();
		int k = inputs.nextInt();
		int[] f = new int[loo];
		for(int i=0;i<loo;i++) {
			f[i] = inputs.nextInt();
		}
		Arrays.sort(f);
		int ans = 0;
		for(int i=0;i<k;i++) {
			ans+=f[i];
		}
		System.out.println(ans);
	}

}
