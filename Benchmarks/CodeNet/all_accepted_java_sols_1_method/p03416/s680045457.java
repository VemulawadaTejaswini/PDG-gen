import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		sc.close();
		
		int count = 0;
		for(int i = A; i <= B; i++) {
			String tmp = String.valueOf(i);
			if(tmp.charAt(0) == tmp.charAt(4) && tmp.charAt(1) == tmp.charAt(3)) {
				count++;
			}
		}
		System.out.println(count);
	}

}