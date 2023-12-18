import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		sc.close();
		sc = null;
		int[] zero = new int[n+2];
		int[] one = new int[n];
		boolean f;
		int j=0;
		int l=0;
		if(s.charAt(0)=='0') {f=true;one[l++]=0;}
		else{f=false;}
		//zero[0]=0;
		for(i=0; i < n; i++) {
			if(!f && s.charAt(i) == '1') {one[l++] = i; f=true;}
			else if(f && s.charAt(i) == '0')  {zero[j++] = i; f=false;}
		}
		zero[j++] = n;
		int max = 0;
		if(j-1 < k) {max=n;}else {
		for(i=k;i<j;i++) {
			if((zero[i] - one[i-k]) > max) max = zero[i] - one[i-k];
		}
		}
		System.out.println(max);
	}
}
