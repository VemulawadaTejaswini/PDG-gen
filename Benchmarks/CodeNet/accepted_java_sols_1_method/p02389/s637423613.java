import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
		try {
			line = br.readLine();
		} catch (IOException e) {
			System.err.println("The input is missing. " + e.getMessage());
			return;
		}

        int x, y;
        try {
        	String[] fields = line.split(" ");
        	x = Integer.parseInt(fields[0]);
        	y = Integer.parseInt(fields[1]);
        } catch(Throwable e) {
			System.err.println("The input is in an illegal form. " + line);
			return;
        }

        StringBuilder b = new StringBuilder();
        b.append(x*y);
        b.append(' ');
        b.append(2*(x+y));
        System.out.println(b.toString());
    }
}