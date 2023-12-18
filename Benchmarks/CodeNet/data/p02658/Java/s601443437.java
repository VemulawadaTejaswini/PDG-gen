import java.util.Scanner;

public class Main {
	public static void Main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int factors = scanner.nextInt();
      	long result = 1l;
      	for(int i = 0; i < factors; i++)
          result *= scanner.nextLong;
      	if(result > Math.pow(10, 18) || result < 0){
      		result = -1;
      	}
      	System.out.print(result);
	}
}