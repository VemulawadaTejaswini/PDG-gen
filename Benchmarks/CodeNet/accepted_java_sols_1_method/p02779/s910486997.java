import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> A = new HashSet<>();
		for(int i = 0;i < N;i++){
			A.add(sc.nextInt());
		}
		sc.close();
		System.out.println(A.size()==N ? "YES" : "NO");

	}

}