import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] a = new Integer[N];
		for(int i = 0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a,Comparator.reverseOrder());
		int count = 1;
		for(int c = 0;c<a.length-1;c++) {
			if(a[c]>a[c+1]) {
			count++;	
			}
		}
		System.out.print(count);
	}
}