//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append(sc.next());
		//System.out.println(sb.charAt(1));
		for(int i=1;i<sb.length()-1;i++) {
			if(sb.charAt(i)=='?') {
			if(sb.charAt(i-1)=='P') {
				if(sb.charAt(i+1)=='P') {
					sb.setCharAt(i, 'D');
				}if(sb.charAt(i+1)=='D') {
					sb.setCharAt(i,'D');
				}if(sb.charAt(i+1)=='?') {
					sb.setCharAt(i, 'P');
				}
			}if(sb.charAt(i-1)=='D') {
				if(sb.charAt(i+1)=='P') {
					sb.setCharAt(i,'D');
				}if(sb.charAt(i+1)=='D') {
					sb.setCharAt(i, 'P');
				}if(sb.charAt(i+1)=='?') {
					sb.setCharAt(i, 'P');
				}
			}
			}
		}
		System.out.println(sb);
	}
	
}