import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String nl = in.nextLine();
      	String[] strs = in.nextLine().split(" ");
        in.close();
      	int[] lst = Stream.of(strs)
      			.mapToInt(Integer::parseInt)
      			.sorted()
      			.toArray();
      	for (int i = 0; i < n*2; i++) {
      		if (i % 2 == 0) {
      			num += lst[i];
      		}
      	}
        System.out.println(num);
    }
}