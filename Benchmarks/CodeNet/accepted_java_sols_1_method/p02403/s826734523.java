import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		for(int a = 1;a>0;a++){
			int H = scan.nextInt();
			int W = scan.nextInt();
			if(H == 0 && W == 0){
				break;
			}
			for(int b = 0;b<H;b++){
				for(int c =0;c<W;c++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}