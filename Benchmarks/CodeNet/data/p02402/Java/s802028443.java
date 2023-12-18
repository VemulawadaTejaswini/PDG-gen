import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		long tot = 0;
		for(int b = 0;b<n;b++){
			a[b] = scan.nextInt();
			tot = tot + a[b];
		}
		int max = a[0];
		int min = a[0];
		for(int c = 1;c<n;c++){
			if(max < a[c]){
				max = a[c];
			}
			if(min > a[c]){
				min = a[c];
			}
		}
		System.out.println(min +" "+ max +" "+ tot);
	}
}