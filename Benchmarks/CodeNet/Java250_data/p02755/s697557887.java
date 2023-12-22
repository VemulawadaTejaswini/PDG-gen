import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		int a = sc.nextInt();
		int b = sc.nextInt();
		//System.out.println((int)Math.floor(1.5));
		for (int i=1;100000000>i;i++) {
			double c = i*0.08;
			//System.out.println((int)c);
			if((int)Math.floor(c)== a) {
				double d = i*0.1;
				if((int)Math.floor(d)== b) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}
		System.out.println("-1");
	}
}