import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int num = sc.nextInt();
			if(num == 0) break;
			int sum = sc.nextInt();
			int max = sum;

			for(int i = 0; i < num - 1; i++){
				int tmp = sc.nextInt();
				if(tmp > tmp + sum)
					sum = tmp;
				else
					sum = tmp + sum;
				max = Math.max(max, sum);
			}
			System.out.println(max);
		}
	}
}