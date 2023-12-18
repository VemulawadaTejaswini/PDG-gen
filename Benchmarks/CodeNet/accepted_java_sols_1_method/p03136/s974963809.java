import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int count=0;
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			count=count+a;
			list.add(a);
		}
		int max = Collections.max(list);
		count=count-max;
		if(count>max) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}