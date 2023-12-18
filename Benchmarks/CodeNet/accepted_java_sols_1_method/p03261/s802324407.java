import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean flag = true;
		List<String> list = new ArrayList<>();
		String first = in.next();
		list.add(first);
		char lastChar = first.charAt(first.length()-1);
		for(int i=1;i<n;i++) {
			String str = in.next();
			if(list.contains(str)) {
				flag = false;
			}
			if(str.charAt(0)!=lastChar) {
				flag = false;
			}
			lastChar = str.charAt(str.length()-1);
			list.add(str);
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}

}
