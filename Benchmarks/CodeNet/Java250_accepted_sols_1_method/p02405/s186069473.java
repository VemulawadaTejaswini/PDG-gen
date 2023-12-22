import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int str1 = scan.nextInt();
		int str2 = scan.nextInt();
		
		int i = 0;
		int j = 0;
		
		while(str1 != 0 && str2 != 0){
			for(i = 1; i <= str1; i++){
				for(j = 1; j <= str2; j++){
					if(i%2==1){
						if(j%2==0){
							System.out.print(".");
						}else if(j%2==1){
							System.out.print("#");
						}
					}else if(i%2==0){
						if(j%2==0){
							System.out.print("#");
						}else if(j%2==1){
							System.out.print(".");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
			str1 = scan.nextInt();
			str2 = scan.nextInt();

		}
		
	}
}