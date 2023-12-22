import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = br.readLine().toCharArray();
		char[] rev = new char[c.length];
		
		for(int i=c.length-1, j=0;i>=0;i--,j++){
			rev[j]=c[i];
		}
		
		System.out.println(String.valueOf(rev));
	}
}