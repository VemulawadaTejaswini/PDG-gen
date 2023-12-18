import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    
    Scanner inputScanner = new Scanner(System.in);
    
    int num = inputScanner.nextInt();
    
    System.out.print(num + ": ");
    if(num == 1)
      System.out.println(1);
    for(int i = 2; i <= num; i++){
      while(num % i == 0){
	num /= i;
	System.out.print(i);
	if(num == 1){
	  System.out.println();
	  break;
	}
	System.out.printf(" ");
      }
    }
  }
}