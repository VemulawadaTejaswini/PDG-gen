import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
   
  int A = scan.nextInt();
  int B = scan.nextInt();
  scan.close();

  	if(A + B >= 10){
  	System.out.println("error");
  	
  	}else{
  	System.out.println(A + B);
  	}
  }
}
