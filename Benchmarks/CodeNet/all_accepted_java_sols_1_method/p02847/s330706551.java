import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String W[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=0;i<7;i++) {
			if(S.equals(W[i])) {
				System.out.println(7-i);
			}
		}
	}
}
