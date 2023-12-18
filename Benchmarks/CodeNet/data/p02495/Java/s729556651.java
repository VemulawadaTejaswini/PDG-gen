import java.util.Scanner;

public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while (true) {
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x == 0 && y == 0)
			break;
		for (int j = 1; j < x+1; j++) {

			for (int i = 1; i < y+1; i++) {
				
				if(j%2!=0){
					if(i%2!=0){
						System.out.print("#");
					}else if(i%2==0){
						System.out.print(".");
					}
				}else if(j%2==0){
					if(i%2==0){
						System.out.print("#");
					}else if(i%2!=0){
						System.out.print(".");
					}
				}
			}System.out.print("\n");

		}

		System.out.print("\n");

	}
}
}