
import java.util.HashSet;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String order="";
		String str="";
		 HashSet<String> dic = new HashSet<String>();

		for (int i = 0; i < n; i++) {
			order=in.next();
			str=in.next();
			if(order.equals("insert")) {
				dic.add(str);
			}else if(order.equals("find")) {
				if(dic.contains(str)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}

		}

		in.close();
	}

}

