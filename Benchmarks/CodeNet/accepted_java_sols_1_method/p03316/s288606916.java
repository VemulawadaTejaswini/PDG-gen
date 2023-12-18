import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner seer = new Scanner(System.in);
		int n = seer.nextInt();
		int aux = n; int sum = 0;
		while(aux > 0){
			sum += aux%10;
			aux/=10;
		}
		if(n % sum == 0) System.out.println("Yes");
		else System.out.println("No");
	}

}
