import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		while(a != 0 && b!=0){

			for(int i=1;i<=a;i++){
				if(i==1 || i==a){
					for(int j=1;j<=b;j++){
						System.out.printf("#");
					}
				}else{
					for(int j=1;j<=b;j++){
						if(j==1 || j==b)
							System.out.printf("#");
						else
							System.out.printf(".");
					}
				}
					System.out.printf("\n");
			}
			System.out.printf("\n");

			a = sc.nextInt();
			b = sc.nextInt();

		}
		
	}
}
