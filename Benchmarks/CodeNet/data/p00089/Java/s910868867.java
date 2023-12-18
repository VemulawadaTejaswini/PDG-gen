import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

	int[][] rhombus;
	int[][] max;
	int row;
	
	int solve(){
		max[0][1]=rhombus[0][0];
		for(int i=1;i<row;++i){
			if(i<=row/2){
				for(int j=1;j<=i+1;++j){
					max[i][j]=Math.max(max[i-1][j-1],max[i-1][j])+rhombus[i][j-1];
				}
			}
			else{
				for(int j=1;j<=row-i;++j){
					max[i][j]=Math.max(max[i-1][j],max[i-1][j+1])+rhombus[i][j-1];
				}
			}
		}
		return max[row-1][1];
	}
	
	void io(){
		rhombus=new int[100][];
		max=new int[100][];
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			for(row=0;row<100&&(str=input.readLine())!=null;++row){
				StringTokenizer token=new StringTokenizer(str,",");
				int n=token.countTokens();
				rhombus[row]=new int[n];
				max[row]=new int[n+2];
				Arrays.fill(max[row],0);
				for(int i=0;i<n;++i){
					rhombus[row][i]=Integer.parseInt(token.nextToken());
				}
			}
			System.out.println(solve());
			
		}catch (IOException e) {
		}
	}

	public static void main(String[] args) {
		new Main().io();
	}

}