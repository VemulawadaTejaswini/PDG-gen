import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		List<Integer> list = new ArrayList<>();
		String str = "zabcdefghijklmnopqrstuvwxy";
		StringBuilder sb = new StringBuilder();
		while(n > 0){
			long amari = n%26;
			n = n/26;
			list.add((int)amari);
		}
		for(int i=list.size()-1; i>=0; i--){
			int amari = list.get(i);
			sb.append(str.charAt(amari));
		}
		System.out.println(sb);
	}
}
