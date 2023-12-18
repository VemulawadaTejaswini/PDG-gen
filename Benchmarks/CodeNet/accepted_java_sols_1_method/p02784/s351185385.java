import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			H -= sc.nextInt();
		}
		System.out.println(H <= 0 ? "Yes" : "No");
	}
}