import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] parts;
		
		parts = br.readLine().split(" ");
		
		int a = Integer.parseInt(parts[0]);
		int b = Integer.parseInt(parts[1]);
		
		String s1 ="";
		for (int i = 0; i<a; i++) {
			s1+=parts[1];
		}
		
		String s2="";
		for (int i = 0; i<b; i++) {
			s2+=parts[0];
		}
		if(s1.compareTo(s2)<0) {
			System.out.println(s1);
			
		}else{
			System.out.println(s2);
		}
	}
	
}
