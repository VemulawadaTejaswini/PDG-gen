import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int[][] v = new int[3][];
			int[] w = new int[n+1];
			int[][] a = new int[3][];
			
			for(int i = 0; i < 3; i++){
				v[i] = new int[n+1];
				a[i] = new int[m+1];
			}

			for(int i = 0; i < n; i++){
				String st = sc.nextLine();
				String[] s = (sc.nextLine()).split(" ");
				
				w[i] = Integer.parseInt(s[0]);
				v[0][i] = Integer.parseInt(s[1]);
				v[1][i] = Integer.parseInt(s[2]);
				v[2][i] = Integer.parseInt(s[3]);
			}
			
			for(int k = 0; k < 3; k++){
				for(int i = 0; i < n; i++){
					for(int j = 0; j <= m; j++){
						if(j >= w[i]){
							if(a[k][j] < a[k][j-w[i]]+v[k][i]){
								a[k][j] = a[k][j-w[i]]+v[k][i];
							}
						}
					}
				}
			}
			n = a[0][m];
			for(int i = 1; i < 3; i++){
				if(n < a[i][m]){
					n = a[i][m];
				}
			}
			
			System.out.println(Integer.toString(n));
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}