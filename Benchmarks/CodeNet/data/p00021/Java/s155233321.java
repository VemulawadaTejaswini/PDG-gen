import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^0-9.]+");
		
		int n = scan.nextInt();

		for(int i=0;i<n;i++){
			long x1 = (long)Math.round(scan.nextDouble()*100000);
			long y1 = (long)Math.round(scan.nextDouble()*100000);
			long x2 = (long)Math.round(scan.nextDouble()*100000);
			long y2 = (long)Math.round(scan.nextDouble()*100000);
			long x3 = (long)Math.round(scan.nextDouble()*100000);
			long y3 = (long)Math.round(scan.nextDouble()*100000);
			long x4 = (long)Math.round(scan.nextDouble()*100000);
			long y4 = (long)Math.round(scan.nextDouble()*100000);
			
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