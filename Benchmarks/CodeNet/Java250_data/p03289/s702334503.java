import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/*Atcoder用
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] abc = br.readLine().split(" ");
		int a = Integer.parseInt(abc[0]);
		int b = Integer.parseInt(abc[1]);
		int c = Integer.parseInt(abc[2]);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();
		for(char c:s)System.out.println(c);
 */


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String get = br.readLine();
		char[] s = get.toCharArray();


		if(s[0] != 'A'){
			System.out.println("WA");
			System.exit(0);
		}
		if(s[1] == 'C' || s[s.length-1] == 'C'){
			System.out.println("WA");
			System.exit(0);
		}

		int k = s[1];
		int j = s[s.length-1];

		if(k<91||j<91){
			System.out.println("WA");
			System.exit(0);
		}

		boolean isCExist = false;
		for(int x = 2;x < s.length-1;x++){
			int asc = s[x];

			if(asc == 67){
				if(isCExist){
					System.out.println("WA");
					System.exit(0);
				}
				else isCExist = true;
			}
			else if(asc < 91){
				System.out.println("WA");
				System.exit(0);
			}

		}

		if(isCExist)System.out.println("AC");
		else System.out.println("WA");
	}


}
