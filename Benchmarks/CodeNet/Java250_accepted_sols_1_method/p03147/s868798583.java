import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		int count=0;
		for(int i=0;n>i;i++) {
			int a = list.get(i);
			if(a!=0) {
				count++;
				for(int j=i;n>j;j++) {
					int b = list.get(j);
					if(b==0)
						break;
					else {
						list.set(j, b-1);
					}
				}
				//System.out.println(list);
				i=-1;
			}
		}
		System.out.println(count);
	}
}