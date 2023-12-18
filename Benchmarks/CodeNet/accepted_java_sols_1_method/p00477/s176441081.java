import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int sum = 0;
			for ( int i = 0; i < 4; i++ )
				sum += sc.nextInt();
			System.out.println(sum/60+"\n"+sum%60);
		}
	}
}