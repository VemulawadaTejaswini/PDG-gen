import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	double A,B,C;
    	A = Double.parseDouble(in.next());
    	B = Double.parseDouble(in.next());
    	C = Double.parseDouble(in.next());
    	
    	double ans = B/A;
    	
    	if (C > ans) {
    		System.out.println((int)ans);
    	} else {
    		System.out.println((int)C);
    	}
    }
}
