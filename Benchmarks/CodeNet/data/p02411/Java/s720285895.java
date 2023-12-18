import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true){
			String line = br.readLine();
			String[] str = line.split(" ");
			int m = Integer.parseInt(str[0]);
			int f = Integer.parseInt(str[1]);
			int r = Integer.parseInt(str[2]);
			
			if((m == -1) || (f == -1)){
				if((m == -1) && (f == -1) && (r == -1)){
					break;
				}
				else{
					sb.append("F\n");
				}
			}
			else if(80 <= m + f){
				sb.append("A\n");
			}
			else if((65 <= m + f) && (m + f < 80)){
				sb.append("B\n");
			}
			else if((50 <= m + f) && (m + f < 65)){
				sb.append("C\n");
			}
			else if((30 <= m + f) && (m + f < 50)){
				if(50 <= r){
					sb.append("C\n");
				}
				else{
					sb.append("D\n");
				}
			}
			else if(m + f < 30){
				sb.append("F\n");
			}
		}
		System.out.print(sb);
	}
}