import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		String as= "" , bs = "";
		for(int i = 0 ; i < b ; i++) {
			as += s[0];
		}
		for(int i = 0 ; i < a ; i++) {
			bs += s[1];
		}
		if(as.compareTo(bs) > 0 ) {
			System.out.println(bs);
		}else {
			System.out.println(as);
		}
	}

}
