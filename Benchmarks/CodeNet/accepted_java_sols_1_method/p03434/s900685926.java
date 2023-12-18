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
		int AliceScore = 0;
		int BobScore = 0;
		for(int c=0;c<a.length;c++) {
		if(c%2==0) {
			AliceScore += a[c];
		}
		else {
			BobScore += a[c];
		}
		}
		System.out.println(AliceScore-BobScore);
	}
}