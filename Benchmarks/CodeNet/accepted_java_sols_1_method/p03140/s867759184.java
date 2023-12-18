import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		//変更必要回数をカウント
		int count = 0;
		for(int i=0; i<n; i++) {
			boolean aIsB = a.charAt(i) == b.charAt(i);
			boolean bIsC = b.charAt(i) == c.charAt(i);
			boolean cIsA = c.charAt(i) == a.charAt(i);
			
			if(aIsB==false && bIsC==false && cIsA==false) {
				count = count+2;
			} else if(aIsB==false && bIsC==false && cIsA==true
					||aIsB==false && bIsC==true && cIsA==false
					||aIsB==true && bIsC==false && cIsA==false) {
				count = count+1;
			}	
		}
		System.out.print(count);
	}
}