import java.util.HashMap;
import java.util.Scanner;

class Main {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String order="";
		String str="";
		HashMap<String,String> dic=new HashMap<String,String>();
		for (int i = 0; i < n; i++) {
			order=in.next();
			str=in.next();
			if(order.equals("insert")) {
				dic.put(str,"0");
			}else if(order.equals("find")) {
				if(dic.containsKey(str)) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}

		}

		in.close();
	}

}

