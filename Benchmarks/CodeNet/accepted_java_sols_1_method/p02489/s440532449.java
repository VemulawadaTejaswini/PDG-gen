import java.io.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
		
		int i=1;
		for(;;) {
                        String str = input.readLine();
		        int x =Integer.valueOf(str);
			if(x == 0) {break;}
			System.out.println("Case "+ i + ": " + x);
			i++;
		}
	}

}