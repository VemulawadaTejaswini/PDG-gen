import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int man[][][] = new int[4][3][10];

		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();

			man[b-1][f-1][r-1] += v;
		}

		String str = Arrays.stream(man)
			.map(x -> 
				Arrays.stream(x)
					.map( y -> 	" " + Arrays.stream(y).mapToObj(String::valueOf).collect(Collectors.joining(" ")))
					.collect(Collectors.joining("\n"))
			)
			.collect(
					Collectors.joining(
						String.format("\n%s\n", String.join("", Collections.nCopies(20, "#")))
					)
			);
		System.out.println(str);
	}
}

