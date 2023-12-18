import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws Exception{
    	Scanner sc = new Scanner(System.in);
    	int n =  sc.nextInt();
    	int s_500 = n/500;
    	n = n % 500;
    	int s_5 = n / 5;
    	System.out.println((s_500 * 1000) + (s_5 * 5));
    }
}