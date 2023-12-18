import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://abc045.contest.atcoder.jp/tasks/arc061_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();
		
		int N = 1<<s.length-1;
		long sum = 0;
		for(int b=0; b<N; b++){
			List<Long> list = new ArrayList<>();
			StringBuilder sb = new StringBuilder();
			sb.append(s[0]);
			for(int i=1; i<s.length; i++){
				if((b&(1<<(i-1)))>0){
					list.add(Long.parseLong(sb.toString()));
					sb = new StringBuilder();	
				}
				sb.append(s[i]);
			}
			if(sb.length()>0) list.add(Long.parseLong(sb.toString()));
			for(long n:list){
				sum += n;
			}
		}
		
		System.out.println(sum);
	}

}