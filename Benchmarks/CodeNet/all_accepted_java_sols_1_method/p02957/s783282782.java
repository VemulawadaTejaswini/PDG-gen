import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = Math.abs(a-b);
		if(c%2==0) {
			if(a<b) {
				System.out.println(a+c/2);
			}
			else {
				System.out.println(a-c/2);
			}

		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}

}