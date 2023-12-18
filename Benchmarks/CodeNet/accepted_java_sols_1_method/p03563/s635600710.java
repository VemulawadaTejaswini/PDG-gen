import java.util.Scanner;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int r = Integer.parseInt(scan.next());
    int g = Integer.parseInt(scan.next());
	System.out.println(String.valueOf(2*g-r));
	return;
  }
}

