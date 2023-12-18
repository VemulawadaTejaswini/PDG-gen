import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int A = sc.nextInt();
	      int B = sc.nextInt();
	      int c = 0;
	      int x, y, n, p;
	      for(int i = A; i <= B; i++) {
	      x = i / 10000;
	      y = i % 10;
	      n = i / 1000 - x * 10;
	      p = (i % 100 -y) / 10;
	      if(x == y && n == p) {
	    	  c++;
	      }
	      }
	      System.out.println(c);
	}
}