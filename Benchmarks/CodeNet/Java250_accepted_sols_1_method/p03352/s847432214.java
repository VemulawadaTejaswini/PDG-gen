import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if(x == 1){
			System.out.println(1);
			return;
		}

		int result = 0;
		for(int i = (int) Math.sqrt(x); i > 1; i--){
			int max = 0;
			int j = i;
			while(max <= x ){
				j *= i;
				if(j > x) break;
				if(max < j) max = j;
			}
			if(result < max) result = max;
		}
		System.out.println(result);
	}
}