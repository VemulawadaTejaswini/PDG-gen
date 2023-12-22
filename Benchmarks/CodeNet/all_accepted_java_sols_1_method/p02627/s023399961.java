import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		char ch = s.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {
			out.print('A');
		} else {
			out.print('a');
		}
		out.flush();
		out.close();
    }
}
