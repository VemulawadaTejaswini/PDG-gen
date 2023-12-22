import java.util.Scanner;
  
public class Main {
	
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int x=Integer.parseInt(sc.next());
	  int y=Integer.parseInt(sc.next());
	  int S=2*x+y*2;
	  System.out.println(x*y +" "+ S);
    
  }
}