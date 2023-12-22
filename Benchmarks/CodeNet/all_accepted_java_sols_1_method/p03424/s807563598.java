import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
public static void main(String[]srgs) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	List<String> list=new ArrayList<String>();
	for(int i=0;i!=a;i++) {
		String str=scan.next();
		if(!list.contains(str)) {
			list.add(str);
			}
	}
	System.out.println(list.size()==4?"Four":"Three");
	scan.close();
}
}