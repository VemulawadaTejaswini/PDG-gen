import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int H = scan.nextInt();
			int W = scan.nextInt();

			if(H == 0 && W == 0){
				break;
			}else{
				for(int i = 1; i <= H; i++){
					String str = "";
					for(int j = 1; j <= W; j++){
						if((i == 1 || i == H) || (j == 1 || j == W)){
							str += "#";
						}else{
							str += ".";
						}
					}
					System.out.println(str);
				}
				System.out.println();
			}
		}
	}
}