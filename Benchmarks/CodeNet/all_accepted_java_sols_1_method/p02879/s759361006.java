import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[][] array = new Integer[n][m];
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>=1&&a<=9) {
			if(b>=1&&b<=9) {
				System.out.println(a*b);
			}
			else {
				System.out.println("-1");
			}
		}
		else {
			System.out.println("-1");
		}
	}
}