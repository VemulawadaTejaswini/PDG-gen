import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String abcd = sc.next();
		sc.close();
		char[] ch = abcd.toCharArray();
		int a = ch[0] - '0';
		int b = ch[1] - '0';
		int c = ch[2] - '0';
		int d = ch[3] - '0';
		List<Integer> e = new ArrayList<>();
		List<String> f = new ArrayList<>();
		e.add(a+b+c+d);
		e.add(a+b+c-d);
		e.add(a+b-c+d);
		e.add(a+b-c-d);
		e.add(a-b+c+d);
		e.add(a-b+c-d);
		e.add(a-b-c+d);
		e.add(a-b-c-d);
		f.add(a+"+"+b+"+"+c+"+"+d);
		f.add(a+"+"+b+"+"+c+"-"+d);
		f.add(a+"+"+b+"-"+c+"+"+d);
		f.add(a+"+"+b+"-"+c+"-"+d);
		f.add(a+"-"+b+"+"+c+"+"+d);
		f.add(a+"-"+b+"+"+c+"-"+d);
		f.add(a+"-"+b+"-"+c+"+"+d);
		f.add(a+"- "+b+"-"+c+"-"+d);

		for (int i=0; i<8; i++) {
			if (e.get(i)==7) {
				System.out.println(f.get(i)+"=7");
				break;
			}
		}
	}
}