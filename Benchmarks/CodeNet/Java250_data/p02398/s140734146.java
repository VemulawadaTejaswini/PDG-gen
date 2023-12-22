import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);
		int cnt = 0;
		for(int i= a; i <= b; i++){
			int x = c % i;
			if( x==0) cnt++;
		}
		System.out.println( cnt );
	}
}