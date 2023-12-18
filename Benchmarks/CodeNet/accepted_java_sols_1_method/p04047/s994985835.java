import java.util.*;

public class Main {
    	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] a = new int[2*n];
		for(int i=0; i<2*n; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		int cnt=0;
		for(int i=0; i<2*n; i+=2) cnt+=a[i];
		System.out.println(cnt);
	}
}
