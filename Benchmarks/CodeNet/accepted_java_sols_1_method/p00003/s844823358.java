import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String args[]) throws IOException{
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int n = Integer.parseInt(bufferedReader.readLine());
		StringBuilder answer = new StringBuilder();
		for(int i=0; i<n; i++){
			String[] dataSet = bufferedReader.readLine().split(" ");
			double x = Math.pow(Integer.parseInt(dataSet[0]), 2);
			double y = Math.pow(Integer.parseInt(dataSet[1]), 2);
			double z = Math.pow(Integer.parseInt(dataSet[2]), 2);
			
			if(x+y==z || x+z==y || y+z==x){
				answer.append("YES\n");	
			}else{
				answer.append("NO\n");	
			}
		}
		System.out.print(answer);
	}	
}