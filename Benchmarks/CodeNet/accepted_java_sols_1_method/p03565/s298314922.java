import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		char[] base = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		
		List<String> list = new ArrayList<>();
		for (int i = 0; i < base.length; i++) {
			if (base.length <= i + t.length-1)
				continue;
			
			boolean flg = true;
			for (int j = 0; j < t.length; j++) {
				flg &= base[i+j] == t[j] || base[i+j] == '?';
			}
			
			if (flg) {
				char[] tmp = new char[base.length];
				for (int j = 0; j < base.length; j++) {
					tmp[j] = i <= j && j <= i+t.length-1 ? t[j-i] : base[j] == '?' ? 'a' : base[j];
				}
				
				list.add(new String(tmp));
			}
			
		}
		
		if (list.isEmpty()) {
			System.out.println("UNRESTORABLE");
			return;
		}
		
		String ans = list.stream().sorted().findFirst().get();
		System.out.println(ans);
	}
	
}
