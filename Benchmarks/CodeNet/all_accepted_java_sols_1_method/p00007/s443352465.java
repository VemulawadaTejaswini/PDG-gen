import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int n = scan.nextInt();
		long mon = 100_000;
		while(n != 0){
			mon *= 1.05;
			n--;
			if(mon % 1000 != 0){
				mon += 1000;
				mon -= mon % 1000;
			}
		}
		System.out.printf("%d\n", mon);
	}
}