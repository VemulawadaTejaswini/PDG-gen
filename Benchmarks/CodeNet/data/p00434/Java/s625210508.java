import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] student = new int[30];
		for (int i=0; i<28; i++) {
			student[sc.nextInt()-1]++;
		}
		for (int i=0; i<30; i++) {
			if (student[i]==0) out.println(i+1);
		}
	}
}
