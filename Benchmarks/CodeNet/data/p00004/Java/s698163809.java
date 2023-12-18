import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int[] a = new int[6];
		String str ;

		double x,y;
		
	
		while(s.hasNext()){

			
			for(int i = 0; i < a.length;i++)
			{
				a[i] = s.nextInt();
			}
			 y = (a[2]*a[3]-a[5]*a[0])/(a[1]*a[3]-a[4]*a[0]);
			 x = (a[2]-a[1]*y)/a[0];
			 System.out.printf("%.3f %.3f\n",x,y);

			
		}
		


	}
}