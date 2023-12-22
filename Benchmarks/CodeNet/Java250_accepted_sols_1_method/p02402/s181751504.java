import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] a;
		a = new int [10020];
		int n = scan.nextInt();
		int i;
		long sum = 0;
		for(i = 1; i <= n; ++i){
			a[i] = scan.nextInt();
		}
		int tmp = a[1];
		int tmp2 = a[1];
		for(i = 1; i <= n; ++i){
			if(tmp <= a[i]){
				tmp = a[i];
				}
			if(tmp2 >= a[i]){
				tmp2 = a[i];
			}
			sum = sum + a[i];
		}
		System.out.println(tmp2+" "+tmp+" "+sum);
	}
}