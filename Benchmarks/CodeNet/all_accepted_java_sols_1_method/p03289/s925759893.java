import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Aflg = 0,Cflg = 0,Ccnt = 0,Cidx = 0,Sup = 0;
		if(S.charAt(0) == 'A') Aflg = 1;
		
		for(int i = 2;i < S.length() - 1;i ++) {
			if(S.charAt(i) == 'C') {
				Ccnt ++;
				Cidx = i;
			}
		}
		if(Ccnt == 1) {
			Cflg = 1;
			for(int i = 1;i < S.length();i ++) {
				if(i != Cidx) {
					if(Character.isUpperCase(S.charAt(i)) == true) Sup = 1;
				}
			}
		}
		
		if(Aflg == 1 && Cflg == 1 && Sup ==0) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}
}