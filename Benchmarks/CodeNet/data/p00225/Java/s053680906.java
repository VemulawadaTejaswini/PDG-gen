import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[26];
			int[] b = new int[26];
			String s = "";
			for(int i=0;i<n;i++){
				s = sc.next();
				a[s.codePointAt(0)-97]++;
				b[s.codePointAt(s.length()-1)-97]++;
			}
			if(Arrays.equals(a,b)==true) System.out.println("OK");
			else System.out.println("NG");
		}
	}
}