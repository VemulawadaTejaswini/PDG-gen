import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		list.set(0, list.get(0)-1);
		for(int i=0;list.size()-1>i;i++) {
			int a = list.get(i);
			int b = list.get(i+1);
			if(a<b)
				list.set(i+1, b-1);
			else if(a>b) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}