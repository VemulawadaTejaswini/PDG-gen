import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		int h = sc.nextInt();
		int n = sc.nextInt();
		int count=0;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			count=count+a;
		}
		if(count>=h)
			System.out.println("Yes");
		else
			System.out.println("No");
    }
}