import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String a = sc.next();
      	String b = sc.next();
		
		sc.close();

		int multiply = Integer.parseInt(a + b);
		boolean isSquared = false;

		for (int i = 0; i * i <= multiply; i++){
			if (i * i == multiply){
				System.out.println("Yes");
				isSquared = true;
				break;
			}
		}

		if ( ! isSquared){
			System.out.println("No");
		}
	}
}
