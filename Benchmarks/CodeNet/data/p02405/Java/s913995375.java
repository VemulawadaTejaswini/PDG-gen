import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		int a,b=0,W,H;
		Scanner br = new Scanner(System.in);
		while(true){
			H=br.nextInt();
			W=br.nextInt();
			if(H==0 && W==0){
				break;
			}else{
				for(a=1;a<=H;a++){
					if(a%2==1){
						for(b=1;b<=W;b++){
							if(b%2==1){
								System.out.print("#");
								}else{
									System.out.print(".");
									}
							}
					}else{
						for(b=1;b<=W;b++){
							if(b%2==1){
								System.out.print(".");
							}else{
								System.out.print("#");
							}
						}
					}
					System.out.println();
				}
			System.out.println();
			}
		}
	}
}