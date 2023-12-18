import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String args[]) throws IOException {
		Main m = new Main();
		m.Run();
	}

	public void Run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = n;
		System.out.print(n + ":");

		List<Integer> L = new ArrayList<Integer>();

		for(int i = 2;i <= x/2 + 1;) {
			if(x % i == 0) {
				x /= i;
				L.add(i);
			}else {
				i++;
			}
		}

		if(x != 1) {
			L.add(x);
		}

		L.stream().forEach(e->System.out.print(" "+e));

		System.out.println();
		scan.close();
	}
}
