
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(),cnt=0;
		for(; cnt<Math.max(a, b); cnt++) {
			if(a+b-(cnt*2) == 0)break;
		}
		System.out.println(cnt<Math.max(a, b)?cnt:"IMPOSSIBLE");
	}
}
