import java.util.Scanner;

public class Main {

	

	static Scanner scan = new Scanner(System.in);
	
		public static void main(String[] args){

			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
//			int a = Integer.parseInt(args[0]);
//			int b = Integer.parseInt(args[1]);
//			int c = Integer.parseInt(args[2]);
			boolean flag=true;
			if(a < b){
				if(b < c){
					System.out.println("Yes");
					flag = false;
				}
			}
			if(flag){
				System.out.println("No");
			}
		}
}

