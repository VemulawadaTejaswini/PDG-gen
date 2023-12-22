import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int H = sc.nextInt();
		int W = sc.nextInt();
		while( H != 0 || W != 0){
			n = 0;
			for(int i=0; i<H;i++){
				for(int s=0; s<W; s++){
					if(s == 0 && i%2 == 0){
						n=0;
					}else if(s == 0){
						n=1;
					}
					if(n%2 == 0){
						System.out.printf("#");
					}else{
						System.out.printf(".");
					}
					n++;
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			H = sc.nextInt();
			W = sc.nextInt();
		}
	}
}