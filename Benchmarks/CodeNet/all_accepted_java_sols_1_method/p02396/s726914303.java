import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		//
		int[] data = new int[10001];
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder output = new StringBuilder();
		for(int i=0; i < 10001; i++){
			data[i] = Integer.parseInt(input.readLine());
			if( data[i] == 0){
				break;
			}
			//output.append("Case ").append(Integer.toString(i+1)).append(": ").append(Integer.toString(data[i])).append("\n");
		}
		for(int i=0; i < 10001; i++){
			if( data[i] == 0){
				break;
			}
			System.out.println("Case "+ (i+1) + ": " + data[i]);
		}
		//System.out.print(output);
		//
	}
}