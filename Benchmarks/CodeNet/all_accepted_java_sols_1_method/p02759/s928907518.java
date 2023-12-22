import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
      	if (n % 2 == 0) {
          System.out.println((int)n/2);
        } else {
          System.out.println((int)n/2+1);

        }
    }
}


