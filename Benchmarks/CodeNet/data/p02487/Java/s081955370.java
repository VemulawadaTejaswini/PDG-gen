import java.util.Scanner;
public clas Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c = 0;
		while(c==0){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H==0 && W==0){
				break;
			}
			for(int i=0;i<H;i++){
				for(int s=0; s<W;s++){
					System.out.printf("#");
				}
				System.out.printf("\n");
			}
		}


	}
}