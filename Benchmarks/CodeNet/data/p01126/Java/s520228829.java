import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if(n==0 && m==0 && a==0) break;

			int[][] line = new int[m+1][n+1];
			
			for(int i=0; i < m; i++){
				int h = sc.nextInt(); 
				int p = sc.nextInt(); 
				int q = sc.nextInt();
				line[h][p] = q;
				line[h][q] = p;
			}
			
			for(int i=line.length-1; i > 0; i--){
				if(line[i][a]!=0){
					a = line[i][a];
				}
			}
			ans.add(a);
		}
		
		for(int i=0; i < ans.size(); i++){
			System.out.println(ans.get(i));
		}
		//sc.close();
	}
}