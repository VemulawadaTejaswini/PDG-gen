import java.util.Scanner;

public class Main {
  static public void main(String args[]){
  	Scanner scan = new Scanner(System.in);
  	
  	int x = scan.nextInt();
  	
  	int result = 0;
  	
  	result = (int)Math.pow(x,3);
  	System.out.println(result);
  }
}