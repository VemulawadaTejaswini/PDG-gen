import java.util.Scanner;
public class Main{
  	public static void main (String [] args){
      	Scanner scanner = new Scanner (System.in);
      	int D = scanner.nextInt();
      	int difference = 25 - D;
      	System.out.print("Christmas");
      	for (int i = 0; i < difference; i++){
          	System.out.print(" Eve");
        }
    }
}