import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		for(int i=0;;i++){
			int H= sc.nextInt();
			int W= sc.nextInt();
			if(H==0 && W==0) break;
			for(;H>0;H--){
				for(int k=W;k>0;k--){
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}