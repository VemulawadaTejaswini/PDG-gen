import java.io.*;
import java.io.IOException;

class Main{
	public static void main(String args[]){
		String[] inp = new String[100];
		String ans = "";
		int sum=0;
		int r,c;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
		inp = br.readLine().split("[\\s]+");
		r = Integer.parseInt(inp[0]);
		c = Integer.parseInt(inp[1]);
		
		
		int table[][] = new int[r+1][c+1];
		
		for(int i=0;i<r;i++){
			inp = br.readLine().split("[\\s]+");
			
			for(int j=0;j<c;j++){
				table[i][j] = Integer.parseInt(inp[j]);
				sum += table[i][j];
			}
			table[i][c]=sum;
			sum=0;
		}
		
		
		
		for(int j=0;j<c+1;j++){
			sum=0;
			for(int i=0;i<r+1;i++){
				sum += table[i][j];
				
			}
			table[r][j] = sum;
			
		}
		
		for(int i=0;i<r+1;i++){
			for(int j=0;j<c+1;j++){
				ans +=table[i][j] + " ";
			}
			System.out.println(ans.substring(0, ans.length()-1));
			ans="";
		}
		}catch(IOException e){
			System.out.println(e);
			return;
		}
	}
}

