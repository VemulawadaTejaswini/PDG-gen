import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[2]);
			if( line[1].equals("?") ){
				break;
			}else if( line[1].equals("+") ){
				sb.append((a + b)+"\n");
			}else if( line[1].equals("-") ){
				sb.append((a - b)+"\n");
			}else if( line[1].equals("*") ){
				sb.append((a * b)+"\n");
			}else if( line[1].equals("/") ){
				sb.append((a / b)+"\n");
			}else if( line[1].equals("%") ){
				sb.append((a % b)+"\n");
			}
		}
		System.out.print(sb);
	}
}