import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] Republican = new Integer[m];
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a-b*2<=0) {
			System.out.println(0);
		}
		else {
			System.out.println(a-b*2);
		}
	}
}

