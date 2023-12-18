import java.util.*;

public class Main{
	public static void main(String[] args){
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
				for(int in2 = 0;in2<W;in2++){
					if(in1%2==0){
						if(in2%2==0){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}else{
							if(in2%2==0){
								System.out.print(".");
							}else{
								System.out.print("#");
							}
						
					}
					if(in2==W-1){
						System.out.println();
					}
				}
			}
			System.out.println();
		}
	}
}