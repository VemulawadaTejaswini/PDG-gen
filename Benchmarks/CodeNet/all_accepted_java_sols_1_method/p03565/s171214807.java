import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] base = sc.next().toCharArray();
		char[] test = sc.next().toCharArray();
		for (int i = base.length - test.length; i >= 0; i--) {
		    boolean flag = true;
		    for (int j = 0; j < test.length; j++) {
		        if (base[i + j] != test[j] && base[i + j] != '?') {
		            flag = false;
		            break;
		        }
		    }
		    if (flag) {
		        for (int j = 0; j < test.length; j++) {
		            base[i + j] = test[j];
		        }
    		    for (int j = 0; j < base.length; j++) {
    		        if (base[j] == '?') {
    		            base[j] = 'a';
    		        }
    		    }
    		    System.out.println(base);
    		    return;
		    }
		}
		System.out.println("UNRESTORABLE");
    }
}

