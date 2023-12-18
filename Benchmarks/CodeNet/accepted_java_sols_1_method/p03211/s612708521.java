import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_suji=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		String s = sc.next();
		List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		for(int i=0;list.size()-2>i;i++) {
			int a = Integer.parseInt(list.get(i)+list.get(i+1)+list.get(i+2));
			list_suji.add(a);
		}
		//System.out.println(list_suji);
		int answer=1000;
		for(int i=0;list_suji.size()>i;i++) {
			int a = Math.abs(list_suji.get(i)-753);
			if(a<answer)
				answer=a;
		}
		System.out.println(answer);
	}
}