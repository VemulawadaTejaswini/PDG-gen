import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in = sc.next();
		int k = sc.nextInt();
		
		String s[] = new String[in.length()];
		
		for(int i=0;i<s.length;i++){
			s[i] = in.substring(i);
		}
		
		Arrays.sort(s);
		
		int p = 0;
		while(k>0){
			int skip = 0;
			if(p>0){
				while(skip < s[p-1].length() && s[p].charAt(skip) == s[p-1].charAt(skip))
					skip++;
			}
			
			if(s[p].length() - skip >= k){
				System.out.println(s[p].substring(0, skip+k));
			}
			
			k -= s[p].length() - skip;
			p++;
		}

	}

}
