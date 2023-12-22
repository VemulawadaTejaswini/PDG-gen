import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int count=0;
		int min = 1000000;
		for(int i=0;n>i;i++) {
			int a = list.get(i);
			if(min>a) {
				min=a;
				count++;
			}
		}/*
			else
				continue loop;
			for(int j=0;i>j;j++) {
				if(list.get(j)<a)
					continue loop;
			}
			count++;
		}*/
		System.out.println(count);
	}
}
