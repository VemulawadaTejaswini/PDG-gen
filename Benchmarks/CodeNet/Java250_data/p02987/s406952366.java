import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		sc.close();
		int i=0;
		for(int j=0;j<3;j++) {
			for(int k=j+1;k<S.length();k++) {
				if(S.charAt(j)==S.charAt(k)) {
					i++;
				}
			}
		}
		if(i==2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}