import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String Length_st = sc.nextLine();
		Integer Length = Integer.valueOf(Length_st);

		int[] num;
		num = new int[Length];

		int num_num = 0;

			for(;num_num != Length;num_num++){
				num[num_num] = sc.nextInt();
			}
			
			for(;Length > 0;Length--){
				System.out.print(num[num_num - 1]);
				if(num_num != 0)System.out.print(" ");
				num_num = num_num - 1;
			}

	}
}