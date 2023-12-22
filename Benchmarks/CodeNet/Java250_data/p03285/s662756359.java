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

		for(int c=0;c<26;c++){
			for(int d=0;d<15;d++){
				if((4*c) + (7*d) == n){
					System.out.println("Yes");
					System.exit(0);
				}
			}
		}
		System.out.println("No");
	}


}