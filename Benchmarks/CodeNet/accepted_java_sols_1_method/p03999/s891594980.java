import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long ans = 0;
		for(int mask = 0 ; mask < (1<<s.length() - 1) ; mask++) {
			String formura = "";
			for(int i = 0 ; i < s.length() ; i++) {
				if((mask&(1<<i)) >= 1) formura += String.valueOf(s.charAt(i)) + "+";
				else formura += String.valueOf(s.charAt(i));
			}
			String[] split = formura.split("\\+");
			for(int i = 0 ; i < split.length ; i++) {
				if(!split[i].isEmpty()) {
					ans += Long.valueOf(split[i]);
				}
			}
		}
		System.out.println(ans);
	}

}
