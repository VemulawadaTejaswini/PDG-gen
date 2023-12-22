import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H=1,W=1;
		int i,j;
		H=sc.nextInt();
		W=sc.nextInt();
		while( H!=0||W!=0){
			
			for(i=1;i<=H;i++){
				for(j=1;j<=W;j++){
					if(i%2==1){
						if(j%2==1)
							System.out.printf("#");
						else
							System.out.printf(".");
					}
					else{
						if(j%2==1)
							System.out.printf(".");
						else
							System.out.printf("#");
					}
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
			H=sc.nextInt();
			W=sc.nextInt();
		}
	}
}