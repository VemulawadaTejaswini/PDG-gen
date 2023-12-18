import java.util.ArrayList;
import java.util.Collections;
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

		Collections.sort(list);
		int b=0;
		int a=0;
		//System.out.println(list);
		int d = n/2;
		int c = d-1;

		int half = list.get(d);
		int check = list.get(c);

		if(half==check) {
			System.out.println(0);
		}
		else {
			System.out.println(half-check);
		}
/*
		for(int i=n-2;n>i;i++) {
			int arc=0;
			int abc=0;
			a = list.get(i);
			a = a-1;
			for(int j=0;n>j;j++) {
				if(a<list.get(j)) {
					arc++;
				}
				else {
					abc++;
				}
			}
			if(arc==abc) {
				a = list.get(i);
				b = list.get(i-1);
				break;
			}
			//System.out.println(arc);
			//System.out.println(abc);
			a=0;
		}


		//System.out.println(a);
		//System.out.println(b);
		System.out.println(a-b);
		*/
		}

}

