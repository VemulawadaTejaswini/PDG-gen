import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		
		char c = s.charAt(k-1);
		
		String sample = String.valueOf(c);
		
		String[] strs = s.split("");
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<strs.length; i++) {
			if(strs[i].equals(sample)) {
				sb.append(sample);
			}else {
				sb.append("*");
			}
		}
		
		System.out.println(sb.toString());
	}
}
