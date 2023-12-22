import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	String[] str = new String[N];
	HashSet<String> set = new HashSet<String>();
	for(int i = 0; i<N; i++) {
	    str[i] = sc.next();
	}
	for(int i = 0; i<N; i++) {
            if(i>=1 && str[i-1].charAt(str[i-1].length()-1) != str[i].charAt(0)) {
                System.out.println("No");
                return;
            }
            if(set.contains(str[i])) {
                System.out.println("No");
                return;
            }
	    set.add(str[i]);
	}
	System.out.println("Yes");
    }
}