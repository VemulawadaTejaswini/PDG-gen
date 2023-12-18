import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^0-9.]+");
		
		int n = scan.nextInt();

		for(int i=0;i<n;i++){
			int x1 = (int)Math.round(scan.nextDouble()*100000);
			int y1 = (int)Math.round(scan.nextDouble()*100000);
			int x2 = (int)Math.round(scan.nextDouble()*100000);
			int y2 = (int)Math.round(scan.nextDouble()*100000);
			int x3 = (int)Math.round(scan.nextDouble()*100000);
			int y3 = (int)Math.round(scan.nextDouble()*100000);
			int x4 = (int)Math.round(scan.nextDouble()*100000);
			int y4 = (int)Math.round(scan.nextDouble()*100000);
			
			if((x2-x1)*(y4-y3)-(x4-x3)*(y2-y1)==0){
				System.out.println("YES");
			}else
			{
				System.out.println("NO");
			}
		}
		
		scan.close();
	}
}