import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[] array = new String[h+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = n*a;

		if(x<=b) {
			System.out.println(x);
		}
		else {
			System.out.println(b);
		}

	}
}