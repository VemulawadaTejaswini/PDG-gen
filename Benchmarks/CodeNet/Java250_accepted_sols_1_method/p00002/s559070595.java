import java.util.ArrayList;
import java.util.Scanner;

//public class Main {
//
//	public static void main(String[] args) {
//		// TODO ?????????????????????????????????????????????
//		Scanner s = new Scanner(System.in);
//		int a,b;
//		ArrayList<String> str = new ArrayList<String>();
//		String[] result;
//		
//		for(int i = 0;i <3;i++)
//		{
//			str.add(s.nextLine());
//
//		}
//		
//		for(int i = 0;i<3;i++)
//		{
//			result = str.get(i).split(" ");
//			a = Integer.parseInt(result[0]);
//			b = Integer.parseInt(result[1]);
//			System.out.println(String.valueOf(a+b).length());
//		}
//	}
//}
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner s = new Scanner(System.in);
		int a,b;
		ArrayList<String> str = new ArrayList<String>();
		String[] result;
		
		while(s.hasNext())
		{

			
			a = s.nextInt();
			b = s.nextInt();
			System.out.println(String.valueOf(a+b).length());
		
		}
	}
}