import java.util.Scanner;
import java.io;

class Main
{
  public void main(String args[]){
    
    Scanner scan = new Scanner(System.in);

    String str = scan.next();
	str = scan.next();
    String[] ab = str.split(" ", 0);
	int a = Integer.parseInt(ab[0]);
	int b = Integer.parseInt(ab[1]);

    System.out.println(a*b);
  }
}