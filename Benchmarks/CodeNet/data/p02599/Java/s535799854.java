import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute19_2();
	}
	
	private static void execute19_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] c = new int[n];
			int[][] lr = new int[q][2];

			for (int i = 0; i < n; i++) {
				c[i] = sc.nextInt();
			}
			for (int i = 0; i < q; i++) {
				lr[i][0] = sc.nextInt();
				lr[i][1] = sc.nextInt();
			}
			
			int[] skipPoint = new int[n];
			int[] cVal = new int[n+1];
			
			for(int i=0; i<n+1;i++) {
				cVal[i]=-1;
			}
			
			for(int i = 0; i < n; i++) {
				skipPoint[i] = cVal[c[i]];
				
				cVal[c[i]]=i;
			}
			
			for(int i=0; i<q; i++) {
				int dup=0;
				for(int k=lr[i][0]-1; k<lr[i][1];k++) {
					if(skipPoint[k]>=lr[i][0]-1) {
						dup++;
					}
				}
				System.out.println(lr[i][1]-lr[i][0]+1-dup);
			}
		}
	}
}