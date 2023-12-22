import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String a = input.next();
		String b = input.next();
		String c = input.next();

		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);
		int ci = Integer.parseInt(c);

		if (ai > bi) {
			int z = ai;
			ai = bi;
			bi = z;
		}

		if (bi > ci){
			int z = bi;
			bi = ci;
			ci = z;
		}

		if (ai > bi) {
			int z = ai;
			ai = bi;
			bi = z;
		}
		
		System.out.println(ai + " " + bi + " " + ci);
	}
}