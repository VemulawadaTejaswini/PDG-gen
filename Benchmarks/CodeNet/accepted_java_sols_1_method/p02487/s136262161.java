import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int i=0;
		int j=0;

		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H==0 && W==0)
				break;
			while(i<H){
				while(j<W){
					if(i==0 || i==H-1){
						System.out.printf("#");
					}else if(j==0 || j==W-1){
						System.out.printf("#");
					}else{
						System.out.printf(".");
					}
					j++;
				}
				System.out.printf("\n");
				j=0;
				i++;
			}
			System.out.printf("\n");
			i=0;
		}
	}
}