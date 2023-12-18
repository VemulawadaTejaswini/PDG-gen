import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[n];
		int n = sc.nextInt();
		int k = sc.nextInt();
		for(int i=0;k>i;i++) {
			int d = sc.nextInt();
			for(int j=0;d>j;j++) {
				int a = sc.nextInt();
				list.add(a);
			}
		}
		List<Integer> listB = new ArrayList<Integer>(new HashSet<>(list));
		System.out.println(n-listB.size());
	}
}