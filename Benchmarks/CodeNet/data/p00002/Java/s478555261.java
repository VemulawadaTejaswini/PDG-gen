
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int[] a = new int[200];
		int[] b = new int[200];
		ArrayList<String> str = new ArrayList<String>();
		String[] result;
		
		for(int i = 0;i <3;i++)
		{
			str.add(s.nextLine());

		}
		
		for(int i = 0;i<3;i++)
		{
			result = str.get(i).split(" ");
			a[i] = Integer.parseInt(result[0]);
			b[i] = Integer.parseInt(result[1]);
			System.out.println(String.valueOf(a[i]+b[i]).length());
		}



		


	}

}