import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		List<Integer> sales = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int kazu = sc.nextInt();
		System.out.println("kazu:"+ kazu);
		int syuturyoku;

		for(int i = 0;i < kazu;i++){
			syuturyoku = sc.nextInt();
			sales.add(syuturyoku);
		}
	}
}
