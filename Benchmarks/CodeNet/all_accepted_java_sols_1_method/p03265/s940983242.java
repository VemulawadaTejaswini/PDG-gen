import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int x = c-a;
		int y = d-b;
		System.out.println(String.valueOf(c-y)+" "+ String.valueOf(d+x)+" "+ String.valueOf(a-y)
		+" " +String.valueOf(b+x));
	}
}