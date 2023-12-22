import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			int cnt = sc.nextInt();
			
			if(cnt <0 || cnt > 10000) {
				System.exit(0);
			}
			
			int[] ary = new int[cnt];
			int input;
			int i=0;
			while(i<cnt) {
				input = sc.nextInt();
				if(input >= -1000000 && input <= 1000000) {
					ary[i] = input;
					i++;
				}
			}
				
			
			long sum =0;
			int min = ary[0];
			int max = ary[0];
			for(int tmp:ary) {
				if(tmp < min) {
					min = tmp;
				}
				if(tmp > max) {
					max = tmp;
				}
				sum += tmp;
			}
			System.out.println(String.format("%d %d %d", min,max,sum));
		}
	}
}