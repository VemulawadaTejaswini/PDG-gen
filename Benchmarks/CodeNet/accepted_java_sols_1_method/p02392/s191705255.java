/*AOJ-ITP-2-2*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int c = Integer.parseInt(str[2]);
		
		if(!(a >= 0 || b >= 0 || c >= 0 || a <= 100 || b <= 100 || c <= 100)){System.exit(1);}
		
		if(a < b && b < c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}