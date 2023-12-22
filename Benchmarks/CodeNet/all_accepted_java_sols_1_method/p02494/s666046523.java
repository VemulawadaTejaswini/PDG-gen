import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0)
				break;
			for(i = 0; i < h; i++){
				for(j = 0; j < w; j++){
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}	
	}
}