import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	if(a > 1000000000000000L){
	System.exit(1);
	}
	double b = sc.nextDouble();
	if(b > 10000000000L){
	System.exit(1);
	}
	sc.close();
	double d = Math.floor(a * b);
	System.out.println((long)d);
    }
}