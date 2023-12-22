import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		char[] c = line.toCharArray();
		for(int i = 0; i < c.length; i++){
			if( Character.isUpperCase(c[i]) ){
				c[i] = Character.toLowerCase(c[i]);
			}
			else if( Character.isLowerCase(c[i]) ){
				c[i] = Character.toUpperCase(c[i]);
			}
		}
		System.out.println(c);
	}
}