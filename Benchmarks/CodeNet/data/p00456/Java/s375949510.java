import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		int[] b = new int[10];
		for(int i = 0 ; i < a.length ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++){
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println((a[a.length-1]+a[a.length-2]+a[a.length-3]) +" "+ (b[b.length-1]+b[b.length-2]+b[b.length-3]));
		sc.close();
	}

}