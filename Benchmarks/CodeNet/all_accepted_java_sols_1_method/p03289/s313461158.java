import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list_big= new ArrayList<String>(Arrays.asList(s.split("")));
		if(!list.get(0).equals("A")) {
			System.out.println("WA");
			System.exit(0);
		}
		int count=0;
		for(int i=2;list.size()-1>i;i++) {
			if(list.get(i).equals("C"))
				count++;
		}
		if(count==1) {
			int two =0;
			for(int i=0;list.size()>i;i++) {
				String x = list_big.get(i).toUpperCase(Locale.getDefault());
				list_big.set(i, x);
			}
			for(int i=0;list.size()>i;i++) {
				if(list.get(i).equals(list_big.get(i)))
					two++;
			}
			if(two==2)
				System.out.println("AC");
			else
				System.out.println("WA");
		}
		else {
			System.out.println("WA");
		}
	}
}