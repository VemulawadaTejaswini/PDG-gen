import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String d = sc.nextLine();
		while (true) {
			String a = sc.nextLine();
			if (a.equals("END_OF_TEXT"))break;
			for (String s : a.split(" ")) {
				if (s.equalsIgnoreCase(d))
					count++;
			}
		}
		System.out.println(count);

	}
}