import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
			while(true){
				int H,W;
				H=cin.nextInt();
				W=cin.nextInt();
				if(H==0 && W==0){
					break;
				}
				for(int n=0;n<H;++n){
					for(int i=0;i<W;++i){
						if(i!=W-1)System.out.print("#");
						else{System.out.println("#");
						}
					}
				}
				System.out.println("");
			}
			
	}
}