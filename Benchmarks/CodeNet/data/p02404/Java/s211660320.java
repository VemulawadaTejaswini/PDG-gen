import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int k=1;
		while(k==1){
			int H=sc.nextInt();
			int W=sc.nextInt();
			for ( int i = 0; i < H; i++ ){
			    for ( int j = 0; j < W; j++ ){
			        if(i==0||i==H-1||j==0||j==W-1){
			            System.out.print("#");
			        } else {
			            System.out.print(".");
			        }
			    }
			    System.out.println();
			}
			System.out.println();
		}
	}

}

