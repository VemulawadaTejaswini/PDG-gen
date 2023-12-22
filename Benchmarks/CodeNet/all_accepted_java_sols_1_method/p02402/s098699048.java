import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){

		int max  =-1000000000;
		int min = 100000000;
		long sum = 0;
		
		int count = scan.nextInt();
		for(int i = 0;i<count;i++){

				int input = scan.nextInt();
//				int input = Integer.parseInt(args[i]);

				if(input > max){
					max = input;
				}
				if(input < min ){
					min = input;
				}
				sum = sum + input;
		}
		System.out.println(min+" "+max+" "+sum);

	}
}

