import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		for(int i=0; i < 10001; i++){
			int data = Integer.parseInt(input.readLine());
			if( data == 0){
				break;
			}
			output.append("Case ").append(Integer.toString(i+1)).append(": ").append(Integer.toString(data)).append("\n");
		}
		System.out.print(output);
	}
}