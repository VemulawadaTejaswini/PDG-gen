import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a*b;
		int d = a+b;
		int e = a-b;

		if(c<d) {
			c=d;
		}

		if(c<e) {
			c=e;
		}

		System.out.println(c);
	}

}