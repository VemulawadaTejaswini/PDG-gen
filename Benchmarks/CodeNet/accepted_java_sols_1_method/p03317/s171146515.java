import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt(),m = sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int min=-1;
		for(int i=0; i<n; i++) {
			if(min==-1||a[i]<min)min=a[i];
		}
		int nomin=0;
		for(int i=0; i<n; i++) {
			if(a[i]==min)nomin++;
		}
		int kai=(int)Math.ceil((n-nomin)*1.0/(m-1));
		System.out.println(kai);
	}
}