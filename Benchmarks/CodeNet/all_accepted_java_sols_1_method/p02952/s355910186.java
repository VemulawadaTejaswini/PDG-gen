import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    int sum = 0;
    for(int i = 1; i <= num1; i++) {
    	if(String.valueOf(i).length() % 2 == 1) {
    		sum++;
    	}
    }
    System.out.println(sum);
  }
}
