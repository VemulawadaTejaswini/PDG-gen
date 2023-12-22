import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H == 0 && W == 0){
				break;
			}

			for(int i = 0; i < H; i++){
				for(int j = 0; j < W; j++){
					if(j == W -1){
						System.out.println('#');
					}else{
						System.out.print('#');
					}
				}
				if(i == H -1){
					System.out.println("");
				}else{
					System.out.print("");
				}
			}
		}
		sc.close();
	}
}