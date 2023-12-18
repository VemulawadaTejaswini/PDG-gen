import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String line = br.readLine();
			int index = line.indexOf(" ");
			int x = Integer.parseInt(line.substring(0, index));
			int y = Integer.parseInt(line.substring(index+1, line.length()));
			if ( x == y) {
				break;
			}else if(x <= y){

				sb.append(x).append(" ").append(y).append("\n");
			}else{
				sb.append(y).append(" ").append(x).append("\n");

			}

		}
		System.out.print(sb);
	}
}