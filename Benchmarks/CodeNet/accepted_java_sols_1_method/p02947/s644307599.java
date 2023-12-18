import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		HashMap<String,Integer> hm = new HashMap<>();
		for(int i = 0; i < n; i++){
		String s = sc.nextLine();
		char[] chr = s.toCharArray();
		Arrays.sort(chr);
		String str = String.valueOf(chr);
		hm.put(str, 1 + hm.getOrDefault(str,0));
		}
		long count = 0;
		for(long cur : hm.values()){
			count += (cur * (cur - 1)/2);
		}
		System.out.println(count);
	}
		
		
	}