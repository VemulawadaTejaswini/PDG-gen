import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			long n = sc.nextLong();
			
			List<String> initials = new ArrayList<>();
			
			long current = n;
			
			while(current > 0) {
				
				current--;
				
				long residual = current % 26;
				current = (current - residual) / 26;
				
				char initial = (char) ('a' + residual);				
				String initStr = String.valueOf(initial);
				
				initials.add(initStr);
				
			}
			
			Collections.reverse(initials);
			StringBuilder sb = new StringBuilder();
			for(String s : initials) {
				sb.append(s);
			}
			
			System.out.println(sb.toString());
		}
	}

}