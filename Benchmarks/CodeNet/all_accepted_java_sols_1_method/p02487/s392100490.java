import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0&&W==0){
				break;
			}
			if(H<3||H>300){
				break;
			}
			if(W<3||W>300){
				break;
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(i==0||i==H-1){
						System.out.print("#");
					}
					if(i>0&&i<H-1){
						if(j==0||j==W-1){
							System.out.print("#");
						}else if(0<j&&j<W-1){
						System.out.print(".");
						}
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}