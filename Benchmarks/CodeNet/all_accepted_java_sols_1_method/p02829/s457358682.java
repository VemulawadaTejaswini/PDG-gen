import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=1;4>i;i++) {
			if(i!=a) {
				if(i!=b)
					System.out.println(i);
			}
		}
	}
}