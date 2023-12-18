import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> list_x=new ArrayList<Integer>();
		List<Integer> list_y=new ArrayList<Integer>();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_x.add(a);
		}
		for(int i=0;m>i;i++) {
			int a = sc.nextInt();
			list_y.add(a);
		}

		for(int i=x+1;y+1>i;i++) {
			int x_max = Collections.max(list_x);
			int y_min = Collections.min(list_y);
			if(i>x_max&&i<=y_min) {
				System.out.println("No War");
				//System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println("War");
	}
}