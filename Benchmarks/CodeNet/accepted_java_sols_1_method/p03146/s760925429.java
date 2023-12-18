import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		list.add(n);
		int i=1;
		loop :while(true) {
			i++;
			if(n%2==0) {
				n=n/2;
			}
			else {
				n=3*n+1;
			}
			for(int j=0;list.size()>j;j++) {
				if(n==list.get(j)) {
					break loop;
				}
			}
			list.add(n);
		}
		System.out.println(i);
		//System.out.println(list);
	}
}