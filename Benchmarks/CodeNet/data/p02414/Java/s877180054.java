import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());
		
		
		long[][] a = new long[n][m];
		long[][] b = new long[m][l];
		long[][] answer = new long [n][l];
		
			
		for(int i = 0;i<n;i++){
			
			for(int j= 0;j<m;j++){
				
				a[i][j] = Long.parseLong(sc.next());
				
			}
		}
		
		for(int i =0;i<m;i++){
			
			for(int j =0;j<l;j++){
				
				b[i][j] = Long.parseLong(sc.next());
			}
		}
		
		
		for(int i = 0; i<n;i++){
			
			for(int j=0; j<m;j++){
				
				for(int k = 0; k<l;k++){
					
					answer[i][k] += a[i][j] * b[j][k];
					
				}
				
			}
		}
		
		for(int i = 0; i<n;i++){
			
			for(int j =0;j<l;j++){
				
				System.out.print(answer[i][j]);
				if(j ==l-1){
					System.out.print("\n");
				}else{
					System.out.print(" ");
				}
			}
			
			
		}
		
		sc.close();
	}
	

}

