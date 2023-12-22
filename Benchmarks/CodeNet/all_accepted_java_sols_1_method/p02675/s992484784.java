import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		//int n = Integer.parseInt(sc.next());
		String s = sc.next();
		int n = Integer.parseInt(s.substring(s.length()-1 ,s.length()));
		Integer[] a = {2,4,5,7,9};
		Integer[] b = {0,1,6,8};
		Integer[] c = {3};
		if(Arrays.asList(a).contains(n)) {
			System.out.println("hon");
		}else if(Arrays.asList(b).contains(n)) {
			System.out.println("pon");
		}else {
			System.out.println("bon");
		}
		
	}
}
