/*AOJ-ITP-2-4*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int W = Integer.parseInt(str[0]);
		int H = Integer.parseInt(str[1]);
		int x = Integer.parseInt(str[2]);
		int y = Integer.parseInt(str[3]);
		int r = Integer.parseInt(str[4]);

		if(!( x >= -100 && x <= 100 && y >= -100 && y <= 100)){System.exit(1);}
		if(((x+r) > 0 && (x+r) <= W && (y+r) > 0 && (y+r) <= H) ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}