import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i] = sc.nextInt();
		}
		
		int idx = 1;
		int[][] arr = new int[w][h];
		for(int i=0;i<w;i++) {
			if(i%2==0) {
				for(int j=0;j<h;j++) {
					arr[i][j] = idx;
					a[idx]--;
					if(a[idx]==0)
						idx++;
				}
			}
			else {
				for(int j=h-1;j>=0;j--) {
					arr[i][j] = idx;
					a[idx]--;
					if(a[idx]==0)
						idx++;
				}
			}
		}
		
		for(int i=0;i<w;i++) {
			for(int j=0;j<h;j++) {
				System.out.print(j==0 ? arr[i][j] : " "+arr[i][j]);
			}
			System.out.println();
		}
	}
}