import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		Set<Integer> set = new HashSet<>();
		for(int i = 1;;++i) {
			int num = (A * i) % B;
			if(!set.contains(num))
				set.add(num);
			else
				break;
		}
		if(set.contains(C))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
