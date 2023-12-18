import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list=new ArrayList<String>();
		//int[] array = new int[n];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			String a = sc.next();
			list.add(a);
		}
		List<String> listB = new ArrayList<String>(new HashSet<>(list));
		System.out.println(listB.size());
	}
}