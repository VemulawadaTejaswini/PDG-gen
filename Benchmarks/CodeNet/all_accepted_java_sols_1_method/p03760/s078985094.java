import java.io.*;

public class Main {
	public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
		String line1 = reader.readLine();
		String line2 = reader.readLine();
		
		char c1[] = line1.toCharArray();
		char c2[] = line2.toCharArray();
		
		if(c1.length == c2.length) {
			for(int i=0;i<c1.length;i++) {
				System.out.print(c1[i]+""+c2[i]);
			}
		}
		else {
			for(int i=0;i<c1.length-1;i++) {
				System.out.print(c1[i]+""+c2[i]);
			}
			System.out.print(c1[c1.length-1]);
		}
		
		
	}catch(IOException e){
		System.out.println(e);
	}
	}
}