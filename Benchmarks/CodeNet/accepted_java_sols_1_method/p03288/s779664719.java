import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a < 1200) System.out.println("ABC"); 
		else if(a >= 1200 && a< 2800) System.out.println("ARC"); 
		else System.out.println("AGC");
	}
}