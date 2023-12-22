
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int n, i, a;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> su = new ArrayList<Integer>();
		n = sc.nextInt();
		
		for(i = 0; n - 1 >= i; i++){
			a = sc.nextInt();
			su.add(new Integer(a));
		}
		
		for(i = n - 1; i >= 0; i--){
			if(i == 0)
				System.out.println(su.get(new Integer(0)));
			else
				System.out.print(su.get(new Integer(i)) + " ");
		}			
	}
}