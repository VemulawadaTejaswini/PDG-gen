import java.util.Scanner;

public class main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int k=1;
		while(k==1){
			int H=sc.nextInt(),W=sc.nextInt();
			if(H==0&&W==0)
				break;
			for ( int i = 0; i < W; i++ ){
				for ( int j = 0; j < H; j++ ){
					System.out.print("#");		       
				}
				System.out.println("");
			}
		}
	}
}
