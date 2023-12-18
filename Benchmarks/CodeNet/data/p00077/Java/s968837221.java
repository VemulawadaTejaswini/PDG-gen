import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/xxxyyyy/input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("src/xxxyyyy/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.next();
			for(int i = 0; i < s.length(); i++){
				if ( s.charAt(i) == '@') {
					i++;
					int n = s.charAt(i) - '0';
					i++;
					while(n-->0) System.out.print(s.charAt(i));
				} else
					System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}

}