import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

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

	        		if(i == 0 || i == a-1) {
		        		sb.append("#");
	        		} else if(j == 0 || j == b-1) {
		        		sb.append("#");
	        		} else {
		        		sb.append(".");
	        		}
	        	}
	        	sb.append("\n");
	        }
	        sb.append("\n");
		}

        System.out.print(sb);
	}
}