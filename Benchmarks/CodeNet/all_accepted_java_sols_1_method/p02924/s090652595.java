import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.parseLong(sc.next());
		
		Long cnt = 0l;
		if(n != 1) {
			cnt = (n*(n-1)/2);
		}
		
		System.out.println(cnt);
	}
}
