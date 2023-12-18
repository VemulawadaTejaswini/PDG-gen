import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int str1 = scan.nextInt();
		int str2 = scan.nextInt();
		
		int i = 0;
		
		while(str1 != 0 && str2 != 0){
			for(i = 0; i < str1; i++){
				System.out.print("#");
				for(int j = 1; j < str2 - 1; j++){
					if(i == 0 || i == str1 - 1){
						System.out.print("#");
					}else{
						System.out.print(".");
				}
				}
				System.out.print("#");
				System.out.println();
			}
			System.out.println();
			str1 = scan.nextInt();
			str2 = scan.nextInt();

		}
		
	}
}