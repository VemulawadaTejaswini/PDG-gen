import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	String T = sc.next();
	HashSet<Character> set = new HashSet<Character>();
	for(int i = 0; i<S.length(); i++) {
	    if(S.charAt(i) == T.charAt(i)) continue;
	    if(set.contains(T.charAt(i))) {
		System.out.println("No");
		return;
	    }
	    set.add(T.charAt(i));
	    S = S.replace(S.charAt(i), '*').replace(T.charAt(i),S.charAt(i)).replace('*',T.charAt(i));
	}
	if(S.equals(T)) {
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }

}