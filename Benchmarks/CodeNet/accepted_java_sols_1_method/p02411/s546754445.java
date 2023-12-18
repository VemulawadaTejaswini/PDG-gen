import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true){
			String[] line = br.readLine().split(" ");
			int m = Integer.parseInt(line[0]);
			int f = Integer.parseInt(line[1]);
			int r = Integer.parseInt(line[2]);
			if( m == -1 && f == -1 && r == -1) break;
			else if( m == -1 || f == -1 || m+f < 30 ) System.out.println("F");
			else if( m+f >= 80 ) System.out.println("A");
			else if( 65 <= m+f && m+f < 80 ) System.out.println("B");
			else if( 50 <= m+f && m+f < 65 || r >= 50 ) System.out.println("C");
			else if( 30 <= m+f && m+f < 50 ) System.out.println("D");
		}
	}
}