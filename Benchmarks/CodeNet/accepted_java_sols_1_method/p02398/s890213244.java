import java.util.Scanner;

public class Main{

	
	static Scanner scan = new Scanner(System.in);
		public static void main(String[] args){
			
			int start = scan.nextInt();
			int end = scan.nextInt();
//			int start = Integer.parseInt(args[0]);
//			int end = Integer.parseInt(args[1]);
			int test =scan.nextInt();
			int count=0;
			for(int i = start;i <= end;i++ ){
				if( test % i== 0){
					count++;
				}
			}
			System.out.println(count);
		}
}

