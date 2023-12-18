import java.io.*;
import java.util.Scanner;

public class Main {

// JAG Team Coding Source

	public static void main(String[] args) {
//		System.setOut(new PrintStream(new File("result.txt")));
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			int[][] know = new int[n+1][];
			for(int i=1;i<=n;i++){
				int m = stdIn.nextInt();
				know[i] = new int[m+1];
				for(int j=1;j<=m;j++){
					know[i][j] = stdIn.nextInt();
				}
			}
			int k = stdIn.nextInt();
			int[] lost = new int[k];
			for(int i=0;i<k;i++){
				lost[i] = stdIn.nextInt();
			}
			// Solve
			int ans = -1;
			for(int i=1;i<=n;i++){
				int cnt = 0;
				for(int j=0;j<k;j++){
					boolean flag = false;
					for(int m=1;m<know[i].length;m++){
						if(lost[j]==know[i][m]){
							flag = true;
							break;
						}
					}
					if(flag){
						cnt++;
						if(cnt==k){
							break;
						}
					}
				}
				if(cnt==k){
					if(ans==-1){
						ans = i;
					}
					else{
						ans = -1;
						break;
					}
				}
			}
			System.out.println(ans);
		}
	}
}