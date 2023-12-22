import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int first = Integer.parseInt(s.substring(0, 2));
		int second = Integer.parseInt(s.substring(2));
//		System.out.println(first + " " + second);
		
		boolean yymm = false;
		boolean mmyy = false;
		if(second > 0 && second <= 12) {
			yymm = true;
		}
		if(first > 0 && first <= 12) {
			mmyy = true;
		}
		
		if(yymm && mmyy) {
			System.out.println("AMBIGUOUS");
		} else if(yymm && !mmyy) {
			System.out.println("YYMM");
		} else if(!yymm && mmyy) {
			System.out.println("MMYY");
		} else {
			System.out.println("NA");
		}
	}
}
