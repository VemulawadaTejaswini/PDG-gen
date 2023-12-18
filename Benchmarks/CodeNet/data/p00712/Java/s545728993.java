import java.util.Scanner;

public class Main{
	static int maxproduct;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int numerator = sc.nextInt();
			int denominator = sc.nextInt();
			maxproduct = sc.nextInt();
			int parts = sc.nextInt();
			if(parts==0) break;
			int count = 0;
			count += Judge(numerator, denominator, parts, 1, 0);
			System.out.println(count);
		}
	}

	static int Judge(int p, int q, int separate, int now_pro, int prev_deno){
		int count = 0;
		if(p==0) count++;
		if(separate<=0) return count;

		int deno = separate*q/p;
		while(p*deno >= q && prev_deno<=deno){
			int subtraction_deno = q * deno;
			int subtraction_nume = p * deno - q;
			if(now_pro*deno<=maxproduct){
				count += Judge(subtraction_nume, subtraction_deno, separate-1, now_pro*deno, deno);
			}
			deno--;
		}
		return count;
	}
}