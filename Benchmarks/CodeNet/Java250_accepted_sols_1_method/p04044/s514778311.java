import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		List<String> list=new ArrayList<String>();
		for(int i=0;i!=a;i++) {
			String str=scan.next();
			list.add(str);
		}
		Collections.sort(list);
		for(int i=0;i!=list.size();i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
	}
}