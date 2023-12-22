import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main {
    public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int s = sc.nextInt();
		 int total = 0;
		 total += s/500 * 1000;
		 s %= 500;
		 total += s/5 *5;
		 System.out.println(total);
	}
}