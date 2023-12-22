import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int count=0;
		
		for(int i = 3;i <= N;i=i+2){
			int y = 0;
			for(int j = 1;j <= i;j++){
				if(i % j==0){
					y++;
				}
				
			}
			if(y == 8){
				count++;
			}
			
		}
		
		System.out.println(count);
		

	}



}