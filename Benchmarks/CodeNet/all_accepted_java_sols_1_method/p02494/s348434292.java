import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j;
		while(true){
			int H=scan.nextInt();
			int W=scan.nextInt();
			for(j=0;j<H;j++){
				for(i=0;i<W;i++){
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			if(H==0 && W==0){
				break;
			}
			System.out.printf("\n");
		}
	}
} 