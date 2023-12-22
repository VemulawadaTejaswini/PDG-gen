import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String str = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		int len = 1;
		for(int i=1; i<16; i++){
			if(Math.pow(26,i) < n){
				len++;
				n -= Math.pow(26,i);
				continue;
			}
			break;
		}
		n--;
		List<Integer> list = new ArrayList<>();
		do{
			long amari = n%26;
			n = n/26;
			list.add((int)amari);
		}
		while(n > 0);
		if(len>list.size()){
			int sa = len - list.size();
			for(int i = 0; i<sa; i++){
				list.add(0);
			}
		}
		for(int i=list.size()-1; i>=0; i--){
			sb.append(str.charAt(list.get(i)));
		}
		System.out.println(sb);
	}
}
