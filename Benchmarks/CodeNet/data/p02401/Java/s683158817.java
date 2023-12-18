import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    while (true) {
		    String line = br.readLine();
		    int a  = Integer.parseInt(line.split(" ")[0]);
		    String op = line.split(" ")[1];
		    int b  = Integer.parseInt(line.split(" ")[2]);

		    if("?".equals(op)) break;

		    if ("+".equals(op)) {
			    System.out.println(a + b);

		    } else if("-".equals(op)) {
			    System.out.println(a - b);

		    } else if("*".equals(op)) {
			    System.out.println(a * b);

		    } else if("/".equals(op)) {
			    System.out.println((int)(a / b));

		    }
	    }
	}
}