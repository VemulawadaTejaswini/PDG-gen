
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		String[] input;

		while(true){
			input=sc.nextLine().split(" ");
			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);
			if(H==0 && W==0){
				break;
			}
			for(int in1=0;in1<H;in1++){
				for(int in2 =0; in2<W; in2++){
					if(in1==0 || in1==H-1 || in2==0 || in2==W-1){
						System.out.print("#");
						if(in2==W-1){
							System.out.println();
						}
					}else{
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
	}
}