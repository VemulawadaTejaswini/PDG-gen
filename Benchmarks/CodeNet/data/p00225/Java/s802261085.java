import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] g = new int[26];
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				g[s.charAt(0)-'a']++;
				g[s.charAt(s.length()-1)-'a']++;
			}
			boolean f = true;
			for (int i = 0; i < g.length; i++) {
				if(g[i]%2!=0){
					f=false;
				}
			}
			if(f){
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}

}