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
				if(b==0 || b==(H-1)){
					for(int c =0;c<W;c++){
						System.out.print("#");
					}
				}else{
					for(int d = 0;d<W;d++){
						if(d == 0 || d == (W-1)){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}