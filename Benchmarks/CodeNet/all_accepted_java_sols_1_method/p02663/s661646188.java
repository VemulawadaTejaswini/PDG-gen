import java.io.*;
import java.math.*;
import java.util.*;


public class Main	 {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	int h1 = sc.nextInt();        	
        	int m1 = sc.nextInt();
        	int h2 = sc.nextInt();
        	int m2 = sc.nextInt();
        	int k = sc.nextInt();
        	int a = h2-h1;
        	int b =0;
        	if(m2-m1<0) {
        		b = 60+(m2-m1);
        		a--;
        	}
        	else
        		b = m2-m1;
        	int minutes = a*60+b;
        	System.out.println(minutes-k);
    }
}
