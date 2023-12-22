import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inf = scan.nextInt();
		int sup = scan.nextInt();
		int num = scan.nextInt();
		int count = 0;
		
		if (inf < 1 || sup < 1 || num < 1 || inf > 10000 || sup > 10000 || num > 10000 || inf > sup) {
			System.out.println("Error!");
		}
		
		for (int i = inf; i <= sup; i++) {
			if ((num % i) == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}