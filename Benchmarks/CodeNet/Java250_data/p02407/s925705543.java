import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String str = br.readLine();
		String[] s = str.split(" ");

		for(int m = Integer.parseInt(n)-1; m >= 0; m--){
			if(m != 0){
				System.out.print(s[m] + " ");
			}else{
				System.out.println(s[m]);
			}
		}
	}
}