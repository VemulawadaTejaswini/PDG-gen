import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int consecutiveValue = scanner.nextInt();
    int includedValue = scanner.nextInt();
    
    int startValue = includedValue - (consecutiveValue - 1); 
    int times = (consecutiveValue - 1) * 2; 
    for(int i = 0; i <= times; i++) {
    	System.out.print(startValue + " ");
    	startValue++;
    }
  }
}
