import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,Integer> words = new LinkedHashMap<>();
		char[] ini=new char[n];
		char[] end =new char[n];

		for(int i=0; i<n; i++) {
			String s=sc.next();
			if(words.get(s)!=null) {
				System.out.println("No");
				return;
			}else {
				words.put(s,1);
				ini[i]=s.charAt(0);
				end[i]=s.charAt(s.length()-1);
			}
		}

		for(int i=0;i<n-1;i++) {
			if(end[i]!=ini[i+1]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}