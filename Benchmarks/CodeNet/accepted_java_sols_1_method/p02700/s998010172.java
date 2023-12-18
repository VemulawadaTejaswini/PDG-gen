import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
      	int a = in.nextInt();
        int b = in.nextInt();
      	int c = in.nextInt();
      	int d = in.nextInt();
        while (a > 0 && c > 0) {
        	if (c <= b) c = 0;
          	else if (a <= d) a = 0;
          	else {
            	a -= d;
              	c -= b;
            }
        }
      	System.out.println(a == 0 ? "No" : "Yes");
    }
}
