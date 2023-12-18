import java.util.*;
import java.math.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> mp = new HashMap<>();
		String meh = in.nextLine();
		for(int qq=1; qq<=n; qq++){
			String a = in.nextLine();
			mp.put(a, 1);
		}
		System.out.println(mp.size());
	}
}