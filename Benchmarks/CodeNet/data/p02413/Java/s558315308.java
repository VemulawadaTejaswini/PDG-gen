import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int r = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int[][] spreadSheet = new int[r+1][c+1];

		for(int i = 0; i<r; i++){
			
			for(int j = 0; j<c; j++){
				
				spreadSheet[i][j] = Integer.parseInt(sc.next());
				spreadSheet[i][c] += spreadSheet[i][j];
				spreadSheet[r][j] += spreadSheet[i][j];
				spreadSheet[r][c] += spreadSheet[i][j];
			}
		}
		
		print(spreadSheet,r,c);
		
		sc.close();
		
	}

	private static void print(int[][] spreadSheet, int r, int c) {
		
		StringBuilder sb = new StringBuilder((c+1) *r);
		
		for(int i=0;i<r+1;i++){
			
			for(int j=0;j<c+1;j++){
				
				sb.append(spreadSheet[i][j]);
				
				if(j == c){
					sb.append("\n");
				}else{
					sb.append(" ");
				}
				
			}
			
		
		}
		
		System.out.print(sb);
		
	}

}

