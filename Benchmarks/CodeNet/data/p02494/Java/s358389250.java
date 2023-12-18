import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y;
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			if(x == 0 && y == 0){
				break;
			}else if(x < 1 || y > 300){
				System.out.println("Error");
				continue;
			}else{
				for(int i = 0; i < x; i++){
					for(int j = 0; j < y; j++){
						System.out.printf("#");
					}
					System.out.printf("\n");
				}
			}
		}	
	}
}