import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(singleOccurence(sc.next()));
		
		
		
	}
	
	public static int singleOccurence(String s)
	{
		int sum = 1;
	    StringBuilder sb = new StringBuilder();
	    if (s.length() > 0) {
	        char prev = s.charAt(0);
	        sb.append(prev);
	        for (int i = 1; i < s.length(); ++i) {
	            char cur = s.charAt(i);
	            if (cur != prev) {
	                sb.append(cur);
	                prev = cur;
	                sum++;
	            }
	        }
	    }
	    return sum;
	}
}