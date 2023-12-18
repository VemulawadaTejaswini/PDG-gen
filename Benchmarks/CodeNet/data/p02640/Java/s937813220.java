import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int kame = (y - x * 2) / 2;
	    
	    int turu = x - kame;
	    
	    if (kame + turu < x  && kame + turu == x) {
	      System.out.println("yes");
	    } else {
	      System.out.println("No");
	    }
	  }
}