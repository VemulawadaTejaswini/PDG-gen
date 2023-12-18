import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n==m) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}