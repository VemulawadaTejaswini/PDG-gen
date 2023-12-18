import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=1000;i++) list.add(i*i);
		int n = in.nextInt();
		int d = in.nextInt();
		int[][] x = new int[n][d];
		for(int i=0;i<n;i++) {
			for(int j=0;j<d;j++) {
				x[i][j] = in.nextInt();
			}
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int dist = 0;
				for(int k=0;k<d;k++) {
					dist += (x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
				}
				if(Collections.binarySearch(list,dist,(e1,e2)->e1-e2)>=0) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		in.close();

	}

}
