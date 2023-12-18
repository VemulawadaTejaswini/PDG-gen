import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		while(true) {
			Integer w = new Integer(n);
			String s = w.toString();
			List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
			int count=0;
			for(int i=0;list.size()-1>i;i++) {
				if(list.get(i).equals(list.get(i+1)))
					count++;
			}
			if(count==list.size()-1) {
				System.out.println(n);
				System.exit(0);
			}
			n++;
		}
	}
}