import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//Long[] array = new Long[6];
        long n = sc.nextLong();
        List<Long> list=new ArrayList<Long>();
        for(int i=0;5>i;i++) {
        	long a = sc.nextLong();
        	list.add(a);
        }
        Collections.sort(list);
        long min = list.get(0);
        long answer = n/min+4;
        if(n%min==0)
        	System.out.println(answer);
        else
        	System.out.println(answer+1);

	}
}