import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.next());
		long total=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0||i%5==0) {
				continue;
			}
			total+=i;
		}
		System.out.println(total);
	}

}
