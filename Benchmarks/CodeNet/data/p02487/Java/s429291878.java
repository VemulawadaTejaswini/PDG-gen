import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0 && y==0)break;
			
			for(int k=0;k<y;k++){
				System.out.printf("#");
			}
			System.out.printf("\n");
			
			for(int j=1;j<(x-1);j++){
				System.out.printf("#");
				for(int i=1;i<y-1;i++){
					System.out.print(".");
				}
				System.out.printf("#\n");
			}
			
			for(int k=0;k<y;k++){
				System.out.printf("#");
			}
			System.out.printf("\n\n");
		}
		sc.close();
		System.exit(0);
	}
}