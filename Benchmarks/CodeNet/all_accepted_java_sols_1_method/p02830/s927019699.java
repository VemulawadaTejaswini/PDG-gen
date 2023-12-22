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
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		List<String> list_s= new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> list_t= new ArrayList<String>(Arrays.asList(t.split("")));
		String answer ="";
		for(int i=0;n>i;i++) {
			answer=answer+list_s.get(i);
			answer=answer+list_t.get(i);
		}
		System.out.println(answer);
	}
}