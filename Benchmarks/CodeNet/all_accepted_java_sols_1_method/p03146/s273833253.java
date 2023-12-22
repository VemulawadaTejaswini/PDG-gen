import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt(),count=1;
		List<Integer> ary = new ArrayList<Integer>();
		ary.add(s);
		while(true) {
			count++;
			if(s%2==0) s/=2;
			else s = 3*s+1;
			if(ary.indexOf(s) != -1)break;
			ary.add(s);
		}
		System.out.println(count);
	}
}
