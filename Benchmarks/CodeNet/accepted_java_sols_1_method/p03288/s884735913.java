import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Atcoder用

/*
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] abc = br.readLine().split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] get = br.readLine().split(" ");
		int n = Integer.parseInt(get[0]);

		if(n<1200){
			System.out.println("ABC");
		}else if(n<2800){
			System.out.println("ARC");
		}else{
			System.out.println("AGC");
		}
	}

}
