import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int X = stdIn.nextInt();
		int Y = stdIn.nextInt();
		int sum = 0;
		
		if(X == 1)sum+=300000;
		else if(X == 2)sum+=200000;
		else if(X == 3)sum+=100000;
		
		if(Y == 1)sum+=300000;
		else if(Y == 2)sum+=200000;
		else if(Y == 3)sum+=100000;
		
		if(X == 1 && Y == 1)sum+=400000;
		
		System.out.println(sum);

	}

}