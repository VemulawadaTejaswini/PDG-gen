import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	char[] alp = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	String ans = "None";
	for(int i=0; i<26; i++) {
		if(!s.contains(String.valueOf(alp[i]))) {
			ans = String.valueOf(alp[i]);
			break;
		}
	}
	System.out.println(ans);
}
}
