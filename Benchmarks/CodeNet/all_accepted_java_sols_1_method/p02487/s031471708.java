import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		while(H!=0||W!=0){
			for(int i = 1; i <= H; i++){
				for(int j = 1; j <= W;j++){
					if(i==1||i==H){
						System.out.printf("#");
					}else if(j==1||j==W){
						System.out.print("#");
					}else{
						System.out.print(".");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
}