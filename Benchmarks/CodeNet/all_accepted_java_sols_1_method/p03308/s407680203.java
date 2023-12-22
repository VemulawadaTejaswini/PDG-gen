import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		
		a.sort(null);
		
		System.out.println(a.get(n - 1) - a.get(0));
		
		
	}
}