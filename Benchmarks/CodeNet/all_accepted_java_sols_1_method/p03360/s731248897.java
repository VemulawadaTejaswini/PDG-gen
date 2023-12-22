
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		for(int i = 0; i < 3; i++){
			int n = sc.nextInt();
			if(max < n) {
				sum += max;
				max = n;
			}else sum += n;
		}
		System.out.println((int)(sum + max * Math.pow(2, sc.nextInt())));
	}
}
