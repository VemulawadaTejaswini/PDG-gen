import java.util.*;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int trainPrice = sc.nextInt();
      	int busPrice = sc.nextInt();
      	
      	System.out.println(trainPrice + (busPrice / 2));
    }
}