import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long length[] = {sc.nextLong(), sc.nextLong(), sc.nextLong()};
		System.out.println(length[0] == length[1] && length[1] == length[2] ? "Yes" : "No");
	}
}