import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			TriangleSequence ts = new TriangleSequence(str);
			
			System.out.println(ts.getBottom());
		}
	}

}

class TriangleSequence{
	int[][] data;
	int n;
	
	public TriangleSequence(String str){
		n = str.length();
		
		data = new int[n][n];
		//??????1??????????????????
		for(int i = 0; i < n; i++){
			data[0][i] = str.charAt(i) - '0';
		}
		//2????????\???
		for(int i = 1; i < n; i++){
			for(int j = 0; j < n - i; j++){
				data[i][j] = (data[i-1][j]+data[i-1][j+1])%10;
			}
		}
	}
	
	public int getBottom(){
		return data[n-1][0];
	}
}