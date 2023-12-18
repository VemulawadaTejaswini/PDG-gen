import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] min = new int[M];
		int[] max = new int[M];

		for(int i=0;i<M;i++) {
			min[i] = sc.nextInt();
			max[i] = sc.nextInt();
		}

		Arrays.sort(min);
		Arrays.sort(max);

		if(max[0] - min[M-1]<0) System.out.print(0);

		else if(max[0] - min[M-1]>=0) System.out.print(max[0]-min[M-1]+1);




}

}