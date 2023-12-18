import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	List<Integer> list=new ArrayList<Integer>();
	int a=scan.nextInt();
	for(int i=0;i!=a;i++) {
		int b=scan.nextInt();
		if(!list.contains(b)) {
			list.add(b);
		}
	}
	System.out.println(list.size());
	scan.close();
}
}