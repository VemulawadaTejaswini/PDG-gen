import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int m[] = new int[n];
			for (int i = 0; i < n; i++) {
				m[i]=sc.nextInt();
			}
			Arrays.sort(m);
			int a=0,b=0;
			for (int i = 0; i < m.length; i++) {
				if(a<=b){
					a+=m[n-1-i];
				}else{
					b+=m[n-1-i];
				}
			}
			System.out.println(Math.abs(a-b));
		}
	}
}