import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int kame = (y - x * 2) / 2;
	    int turu = (y - kame * 4) / 2;

	    if (kame >= 0  && turu >= 0 &&  kame*4+turu*2 == y) {
	      System.out.println("yes");
	    } else {
	      System.out.println("No");
	    }
	  }
}