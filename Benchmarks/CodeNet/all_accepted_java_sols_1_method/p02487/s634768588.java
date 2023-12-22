import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H==0&&W==0){
				break;
			}
			for(i = 0;i<H;i++){
				for(j=0;j<W;j++){
					if(j == W-1){
						System.out.println("#");
					}
					else if(j==0||i==0||i==H-1){
						System.out.print("#");
					}
					else{
						System.out.print(".");
					}
				}
			}
			System.out.println("");
		}
	}
}