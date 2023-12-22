import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int n = sc.nextInt();
		//int k = sc.nextInt();
		//String[] array = new String[h+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();

		for(int i=0;n>i;i++) {
			int a=sc.nextInt();
			list.add(a);
		}

		int count=0;
		for(int i=1;n-1>i;i++) {
			int a=list.get(i-1);
			int b=list.get(i);
			int c=list.get(i+1);

			if((b>a&&b<c)||(b<a&&b>c)) {
				count++;
			}
		}

		System.out.println(count);

		}

}

