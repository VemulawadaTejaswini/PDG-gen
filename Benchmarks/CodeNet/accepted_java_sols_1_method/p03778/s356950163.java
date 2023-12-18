import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
    	int w = Integer.parseInt(sc.next());
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
      	
		if (a + w < b) {
        	System.out.println(b - (a + w));
        } else if (b + w < a) {
        	System.out.println(a - (b + w));
        } else {
        	System.out.println(0);
        }
    }
}