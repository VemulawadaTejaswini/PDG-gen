import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int four = 0;
		int two = 0;
		int other = 0;
		for (int i = 0; i < n; i++) {
		    int a = sc.nextInt();
		    if (a % 4 == 0) {
		        four++;
		    } else if (a % 2 == 0) {
		        two++;
		    } else {
		        other++;
		    }
		}
		boolean flag;
		if (four == 0) {
		    if (other == 0 && two >= 2) {
		        flag = true;
		    } else {
		        flag = false;
		    }
		} else if (four - other >= 0) {
		    flag = true;
		} else if (four - other >= -1) {
		    if (two == 0) {
		        flag = true;
		    } else {
		        flag = false;
		    }
		} else {
		    flag = false;
		}
		if (flag) {
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
		}
	}
}
