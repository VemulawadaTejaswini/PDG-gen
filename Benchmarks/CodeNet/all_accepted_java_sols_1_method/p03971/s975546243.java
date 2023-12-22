import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToInt(Integer::parseInt).toArray();
		String[] peaple = sc.nextLine().split("", 0);
		int lim = line[1] + line[2];
		int ab_con = 0;
		int b_con = 0;

		for (int i = 0; i < line[0]; i++) {
			//cはじく
			if (peaple[i].equals("c")) {
				System.out.println("No");
			} else if(peaple[i].equals("a")){
				//a
				if (ab_con <lim) {
					System.out.println("Yes");
					ab_con++;
				}else {
					System.out.println("No");
				}
			} else if(peaple[i].equals("b")) {
				//b
				if (ab_con <lim && b_con < line[2]) {
					System.out.println("Yes");
					ab_con++;
					b_con++;
				}else {
					System.out.println("No");
				}
			}
		}
	}
}
