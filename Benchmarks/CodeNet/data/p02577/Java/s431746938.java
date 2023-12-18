import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			String s = sc.next();
			
			int len = s.length();
			int cnt = 0;
			char[] sChars = s.toCharArray();
			
			for(int i=0;i<len;i++) {
				cnt= cnt+Character.getNumericValue(sChars[i]);		
			}
			
			if(Math.floorMod(cnt,9)==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
				
			}
	}	
}