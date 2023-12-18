
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
	
	public static class Compress{
		int times;
		Compress child;
		Compress next;
		String input;
		
		public Compress(int times, Compress child, Compress next, String input) {
			super();
			this.times = times;
			this.child = child;
			this.next = next;
			this.input = input;
		}
		
		public long get_ch_next_len(){
			long len = 0;
			if(this.child != null){
				len = this.child.get_ch_next_len();
			}else{
				len = input.length();
			}
			len *= this.times;
			
			if(this.next != null){
				len += this.next.get_ch_next_len();
			}
			
			return len;
		}
		
		private long calc(){
			return this.get_ch_next_len();
		}
		
		private long calc2(){
			long len = 0;
			
			if(this.child != null){
				len += this.child.get_ch_next_len();
			}else{
				len += this.input.length();
			}
			len *= this.times;
			
			return len;
		}
		
		public char get_ch(long N, int times){
			//System.out.println(this + " " + N);
			char ret = '0';
			
			if(this.child != null){
				ret = this.child.get_ch(N, this.times);
			}
			
			if(ret != '0'){
				return ret;
			}else{
				long len = this.calc();
				
				//System.out.println(this.toString() + " " + N + " " + len);
			
				if(N < len * times){
					long len2 = this.calc2();
					long rest = N % len;
					
					//System.out.println("> " + this.toString() + " " + rest + " " + len2);
					
					if(this.child != null && rest < len2){
						return this.child.get_ch(rest % len2, this.times);
					}else if(this.input != null && rest < len2){
						return this.input.charAt((int) (rest % this.input.length()));
					}else if(this.next != null && rest >= len2){
						return this.next.get_ch(rest - len2, times);
					}else{
						return '0';
					}
				}else{
					return '0';
				}
			}
			
		}
		
		public String toString(){
			StringBuilder sb = new StringBuilder();
			
			sb.append(times);
			
			if(this.child != null){
				sb.append("(");
				sb.append(this.child.toString());
				sb.append(")");
			}else{
				sb.append(this.input);
			}
			
			if(this.next != null){
				sb.append(this.next.toString());
			}
			
			return sb.toString();
		}
	}
	
	public static Compress parse(char[] input, int start , int end){
		
		int times = 0;
		int loop_start = start;
		
		while(loop_start <= end){
			if('0' <= input[loop_start] && input[loop_start] <= '9'){
				times *= 10;
				times += input[loop_start] - '0';
				loop_start++;
			}else{
				break;
			}
		}
		
		boolean kakko_found = false;
		int kakko_lv = 0;
		int kakko_start = -1;
		int kakko_end = -1;
		
		Compress ret = new Compress(times, null, null, "");
		
		for(int cur = loop_start; cur <= end; cur++){
			if(input[cur] == '('){
				kakko_found = true;
				
				if(kakko_lv == 0){
					kakko_start = cur;
				}
				
				kakko_lv++;
			}else if(input[cur] == ')'){
				kakko_lv--;
				
				if(kakko_lv == 0){
					kakko_end = cur;
					
					ret.child = parse(input, kakko_start + 1, kakko_end - 1);
					break;
				}
			}
		}
		
		if(!kakko_found){
			ret.times = times == 0 ? 1 : times;
			
			StringBuilder sb = new StringBuilder();
			sb.append(input[loop_start]);
			
			ret.input = sb.toString();
			kakko_end = loop_start;
		}
		
		if(kakko_end < end){
			ret.next = parse(input, kakko_end + 1, end);
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String input = sc.next();
			final int N = sc.nextInt();
			
			if("0".equals(input) && N == 0){
				break;
			}
			
			Compress comp = parse(input.toCharArray(), 0, input.length() - 1);
			
			//System.out.println(comp);
			
			System.out.println(comp.get_ch(N, 1));
			
		}
		
	}

	
}