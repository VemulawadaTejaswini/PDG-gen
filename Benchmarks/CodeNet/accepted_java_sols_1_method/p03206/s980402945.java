import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer day = sc.nextInt();
      	int minus = 25;
      	System.out.print("Christmas ");
      	for(int i = 0; i < (minus - day); i++){
          System.out.print("Eve ");
        }
      	System.out.println("");
	}
}