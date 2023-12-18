import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String s = sc.nextLine();
			if (s.equals("#")) {
				break;
			}
			s = s.replaceAll(" ", "");
			System.out.println(value(s));
		}
	}
	
	public static int index = 0;
	public static long value(String s) {
		index = 0;
		return expr(s);
	}
	public static long expr(String s) {
		long ret = term(s);
		while(index+2 < s.length()) {
			index+=2;
			if (s.charAt(index) == '>') {
				index-=2;
				return ret;
			}else{
				long y = term(s);
				if (y<64) {
					ret >>= y;
				}else{
					ret = 0;
				}
			}
		}
		return ret;
	}
	public static long term(String s) {
		char c = s.charAt(index);
		if (c == 'S') {
			index+=2;
			long num = expr(s);
			index+=1;
			return (num*num)%1000000007L;
		}else{
			return number(s);
		}
	}
	public static long number(String s) {
		long ret = 0;
		try {
			while(index < s.length()) {
				long n = Long.parseLong(s.substring(index,index+1));
				ret = ret * 10 + n;
				index++;
			}
		} catch (NumberFormatException e) {
			return ret;
		}
		return ret;
	}
}