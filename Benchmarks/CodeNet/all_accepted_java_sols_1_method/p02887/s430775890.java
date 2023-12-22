import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int amount = s.nextInt();
		String slime = s.next();
		int total = 1;
		for(int i = 0; i < amount-1; i++) {
			if(slime.charAt(i) != slime.charAt(i+1)){
				total += 1;
			}
		}
		
		System.out.println(total);
	}
}
