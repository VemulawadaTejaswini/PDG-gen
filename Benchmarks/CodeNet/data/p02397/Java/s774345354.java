import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] s = str.split(" ");

		for(;;){
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);

			if(a == 0){
				if(b == 0){
					break;
				}
			}else if(a < b){
				System.out.println(b +" "+a);
			}else{
				System.out.println(a +" "+b);
			}
		}
	}
}