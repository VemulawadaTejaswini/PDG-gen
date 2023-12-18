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
				for(int m=0;m<H;m++){
					if(m%2==0){
						for(int n=0;n<W+1;n++){
							if(n==W){
								System.out.println("");
							}
							else if(n%2==0){
								System.out.print("#");
					     	}
							else if(n%2==1){
								System.out.print(".");
						    }
						}
					}
					if(m%2==1){
						for(int n=0;n<W+1;n++){
							if(n==W){
								System.out.println("");
							}
							else if(n%2==0){
								System.out.print(".");
							}
							else if(n%2==1){
								System.out.print("#");
							}
						}
					}
				}
				System.out.println("");
				}
	}
}