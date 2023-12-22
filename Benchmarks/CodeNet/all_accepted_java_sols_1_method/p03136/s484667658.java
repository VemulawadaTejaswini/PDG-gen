import java.util.*;
import java.io.*;
public class Main {
  	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int max = 0;
      	int total = 0;
      	for(int i = 0; i < n; i++) {
          	int x = sc.nextInt();
          	total += x;
        	max = Math.max(x, max);
        }
      	System.out.println(max < total - max ? "Yes" : "No");
    }
}