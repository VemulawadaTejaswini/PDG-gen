import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strArray = new String[2];
		int a, b;

		while(true) {
	        strArray = br.readLine().split(" ");
	        a = Integer.parseInt(strArray[0]);
	        b = Integer.parseInt(strArray[1]);

	        if(a == 0 && b == 0) {
	        	break;
	        }

	        for(int i=0; i<a; i++) {
	        	for(int j=0; j<b; j++) {
	        		if(i%2 == 1 ) {
	        			if(j%2 == 1) {
	        				System.out.print("#");
	        			} else {
	        				System.out.print(".");
	        			}
	        		} else {
	        			if(j%2 == 1) {
	        				System.out.print(".");
	        			} else {
	        				System.out.print("#");
	        			}
	        		}
	        	}
				System.out.println();
	        }
			System.out.println();
		}
	}
}

