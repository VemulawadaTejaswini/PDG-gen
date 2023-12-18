import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[][] d = new int[n][2];
			for(int i=0;i<n;i++){
				d[i][0] = stdIn.nextInt();
				for(int j=0;j<8;j++){
					int tmp = stdIn.nextInt();
					if(j%2==0){
						tmp*=60;
					}
					d[i][1]+=tmp;
				}
			}
			int[] cp = new int[n];
			for(int i=0;i<n;i++){
				cp[i] = d[i][1];
			}
			Arrays.sort(cp);
			for(int i=0;i<n;i++){
				if(cp[0]==d[i][1]){
					System.out.println(d[i][0]);
					break;
				}
			}
			for(int i=0;i<n;i++){
				if(cp[1]==d[i][1]){
					System.out.println(d[i][0]);
					break;
				}
			}
			for(int i=0;i<n;i++){
				if(cp[n-2]==d[i][1]){
					System.out.println(d[i][0]);
					break;
				}
			}
		}
	}
}