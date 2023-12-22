import java.util.*;

public class Main {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
    	int trainLength = sc.nextInt();
      	int posFromFront = sc.nextInt();
      	System.out.println(trainLength - (posFromFront - 1));
    }
}