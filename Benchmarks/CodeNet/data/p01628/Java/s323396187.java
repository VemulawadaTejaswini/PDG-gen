import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] nn = new int[n];
		for(int i=0;i<m;i++){
			int a = sc.nextInt()-1;
			int left = -1;
			int right = -1;
			if(a-1>=0) left = nn[a-1];
			if(a+1<=n-1) right = nn[a+1];
			nn[a] = Math.max(left, right) + 1;
		}

		Arrays.sort(nn);
		System.out.println(nn[n-1]);
	}	
}