import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		List<String>list=new ArrayList<String>();
		String st=scan.next();
		for(;;) {
			String str=scan.next();
			if(str.equals("END_OF_TEXT")) {
				break;
			}
			list.add(str.toLowerCase());
		}
		int c=0;
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			if(st.equals(s)) {
				c++;
			}
		}
		System.out.println(c);
	}
}
