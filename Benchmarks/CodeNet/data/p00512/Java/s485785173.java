import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 6;
		int max = 0;
		HashMap<String,Integer> hm = new HashMap<>();
		String[] st = new String[n];
		int aa = 0;
		while(n--!=0) {
			String str = sc.next();
			min = Math.min(min, str.length());
			max = Math.max(max, str.length());
			int a = sc.nextInt();
			if(!hm.containsKey(str)) {
				st[aa] = str; aa++;
				hm.put(str, a);
			}	
			else
				hm.put(str, hm.get(str)+a);
		}
		String[] stt= Arrays.copyOfRange(st, 0, aa);
		Arrays.sort(stt);
		for(int i=min;i<=max;i++) {
			for(int j=0;j<aa;j++) {
				if(stt[j].length()!=i) continue;
				System.out.println(stt[j]+" "+hm.get(stt[j]));
			}
		}
	}
}
