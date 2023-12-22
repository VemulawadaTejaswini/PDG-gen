import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int t = sc.nextInt();
		int answer=10000;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b<=t&&a<answer) {
				answer=a;
			}
		}
		if(answer==10000)
			System.out.println("TLE");
		else {
			System.out.println(answer);
		}
	}
}