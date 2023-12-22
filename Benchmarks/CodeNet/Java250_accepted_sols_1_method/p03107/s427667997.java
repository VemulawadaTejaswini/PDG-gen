import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		int zero = 0;
		int one = 0;
		for(int i=0;list.size()>i;i++) {
			if(list.get(i).equals("0"))
				zero++;
			else
				one++;
		}
		if(zero>=one)
			System.out.println(one*2);
		else
			System.out.println(zero*2);
	}
}