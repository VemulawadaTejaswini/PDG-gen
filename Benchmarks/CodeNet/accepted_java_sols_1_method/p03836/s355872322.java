import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int[] in = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = in[2] - in[0];
		int y = in[3] - in[1];
	
		String S = "";
		for (int i = 0;i < y; i++) S += "U";
		for (int i = 0;i < x; i++) S += "R";
		for (int i = 0;i < y; i++) S += "D";
		for (int i = 0;i < x; i++) S += "L";
		S += "L";
		
		for (int i = 0;i < y + 1; i++) S += "U";
		for (int i = 0;i < x + 1; i++) S += "R";
		S += "D" + "R";
		for (int i = 0;i < y + 1; i++) S += "D";
		for (int i = 0;i < x + 1; i++) S += "L";
		S += "U";
		
		System.out.println(S);
	}
}
