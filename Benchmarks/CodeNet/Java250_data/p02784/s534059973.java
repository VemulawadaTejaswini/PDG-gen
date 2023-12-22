import java.util.*;
import static java.lang.Math.ceil;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int health = input.nextInt();
		int n = input.nextInt();
		Vector<Integer> a = new Vector<>(n);
		int sum = 0;
		for(int i = 0;i < n; ++i){
			int x = input.nextInt();
			a.add(x);
		}
		for(int i = 0;i < n; ++i){
			sum += a.get(i);
		}
		if(sum >= health){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}