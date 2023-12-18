import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] s = a.toCharArray();
		String b = sc.nextLine();
		char[] t = b.toCharArray();
		
		String hakoA = "";
		String hakoB = "";
		
		int ans=0;
		
		for(int i=0; i<t.length;i++) {
			hakoA += String.valueOf(t[i]);
			if(a.contains(hakoA)) {
				if(ans<i+1) {
					ans=i+1;
				}
			}
			
			hakoB += String.valueOf(t[t.length-i-1]);
			if(a.contains(hakoB)) {
				if(ans<i+1) {
					ans=i+1;
				}
			}
		}
		
		
		System.out.println(t.length-ans);
	}
}
