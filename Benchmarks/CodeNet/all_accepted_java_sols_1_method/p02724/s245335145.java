import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
        int num500 = x / 500;
      	int num50 = x % 500 / 5;
      	System.out.println(num500 * 1000 + num50 * 5);
    }
 }