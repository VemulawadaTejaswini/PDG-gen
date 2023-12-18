import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list=new ArrayList<String>();
		//int[] array = new int[1000000000*2];
		int a = sc.nextInt();
		int b = sc.nextInt();
		String a_s = String.valueOf(a);
		String b_s = String.valueOf(b);
		for(int i=0;b-1>i;i++) {
			a_s=a_s+String.valueOf(a);
		}
		for(int i=0;a-1>i;i++) {
			b_s = b_s+String.valueOf(b);
		}
		list.add(a_s);
		list.add(b_s);
		Collections.sort(list);
		System.out.println(list.get(0));

	}
}