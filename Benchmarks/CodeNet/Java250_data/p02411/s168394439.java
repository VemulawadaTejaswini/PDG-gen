import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		while(true){
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int f = Integer.parseInt(input[1]);
			int r = Integer.parseInt(input[2]);

			if( m==-1 && f==-1 && r==-1 ) break;

			if( m==-1 || f==-1 || (m+f) < 30){
				sb.append("F\n");
			}else if( (m+f)>=30 && (m+f)<50 && r<50 ){
				sb.append("D\n");
			}else if( (m+f)>=30 && (m+f)<50 && r>=50 ){
				sb.append("C\n");
			}else if( (m+f)>=50 && (m+f)<65 ){
				sb.append("C\n");
			}else if( (m+f)>=65 && (m+f)<80 ){
				sb.append("B\n");
			}else if( (m+f)>=80 ){
				sb.append("A\n");
			}
		}

		System.out.print(sb);
	}
}