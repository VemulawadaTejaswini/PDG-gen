import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int[] a = new int[6];
		String str ;
		String[] result;
		double x,y;
		
	int counter = 0;
		while(true){
			str = s.nextLine();
			if(str.length() == 0)
			{
				break;
			}
			result = str.split(" ");
			for(int i = 0; i < a.length;i++)
			{
				a[i] = Integer.parseInt(result[i]);
			}
			 y = (a[2]*a[3]-a[5]*a[0])/(a[1]*a[3]-a[4]*a[0]);
			 x = (a[2]-a[1]*y)/a[0];
			 System.out.printf("%.3f %.3f\n",x,y);

			if(++counter>1)
				break;
		}
		


	}
}