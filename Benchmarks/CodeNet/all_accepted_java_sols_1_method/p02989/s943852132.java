
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d[] = new int[n];

		//ABC < K    k <= ARC

		for(int i = 0; i < n; i++)
			d[i] = in.nextInt();

		Arrays.sort(d);

		int hrf = d.length/2-1;

		if(d[hrf] == d[hrf+1]) {
			System.out.println(0);
			return;
		}

		int ans = d[hrf+1] - d[hrf];


		System.out.println(ans);
	}

}