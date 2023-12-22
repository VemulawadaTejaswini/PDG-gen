import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		int W,H,a,b;
		Scanner br = new Scanner(System.in);
		while(true){
			H=br.nextInt();
			W=br.nextInt();
			if(H==0 && W==0 ){
				break;
			}else{
				for(a=1;a<=H;a++){
					if(a==1 || a==H){
						for(b=1;b<=W;b++){
							System.out.print("#");
						}
						System.out.println();
					}else{
						for(b=1;b<=W;b++){
							if(b==1 || b==W){
								System.out.print("#");
							}else{
								System.out.print(".");
							}
						}
						System.out.println();
					}
				}
				System.out.println();
			}
		}
	}
}