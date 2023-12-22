import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");

		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		if(a > -1000){
			if(b < 1000){
				if(a < b){
					System.out.println("a < b");
				}else if ( a == b){
					System.out.println("a == b");
				}else{
					System.out.println("a > b");
				}
			}
		}
	}
}