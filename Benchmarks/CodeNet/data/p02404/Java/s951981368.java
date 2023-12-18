import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
		int H=sc.nextInt();
		int W=sc.nextInt();
		if( H==0&&W==0) {
			break;
		}else{
			for(int a=0;a<H;a++) {
			for(int b=0;b<W;b++) {
				if(a==0||b==0||a==H-1||b==W-1) {
				System.out.print("#");
				}else {
				System.out.print(".");
				}
			}
			System.out.println("");
		}
		}
		}
	}
}

