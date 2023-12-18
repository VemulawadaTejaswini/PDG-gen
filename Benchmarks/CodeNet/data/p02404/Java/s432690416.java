import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int H,W;
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			H=scan.nextInt();
			W=scan.nextInt();
			if(H==0&&W==0)
				break;
			
			for(int i=0;i<H;i++) {
				
				for(int j=0;j<W-1&&(i==0||i+1==H)||j==0;j++) {
					System.out.printf("#");
				}
				for(int k=0;k<W-2&&i!=0&&i+1!=H;k++) {
					System.out.printf(".");
				}
				System.out.printf("#\n");
				
			}
			System.out.printf("\n");
			
		}

	}

}