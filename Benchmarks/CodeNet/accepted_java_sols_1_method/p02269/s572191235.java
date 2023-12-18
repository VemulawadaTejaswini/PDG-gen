

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//模拟字典，n为总共指令数，insert插入， find查找，有则输出yes，没有no
//
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Set<String> set = new HashSet<>();
		String s1;
		String s2;
		for (int i = 0; i < n; ++i) {
			s1 = scan.next();
			s2 = scan.next();
			//System.out.println("1" + s1);
			//System.out.println("2" + s2);
			if (s1.equals("insert"))
				set.add(s2);
			if (s1.equals("find"))
				if (set.contains(s2))
					System.out.println("yes");
				else
					System.out.println("no");
				
		}
		//System.out.println(set);
	}
}

