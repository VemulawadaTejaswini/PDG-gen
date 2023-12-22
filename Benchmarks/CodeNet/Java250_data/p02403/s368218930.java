import java.util.Scanner;
class Main{
	Scanner sc = new Scanner(System.in);
	int H;
	int W;
	
	void sp1(){
		while(true){
			H = sc.nextInt();
			W = sc.nextInt();
			if(H==0 && W==0)break;
	
			for(int i=0; i<H; i++){
				
			
				for(int j=0; j<W; j++){
					System.out.print("#");
					
				}
				System.out.println();

			}	
			System.out.println();
		}
	}
	
	
		public static void main(String[]agrs){
			new Main().sp1();
		}
	}
		