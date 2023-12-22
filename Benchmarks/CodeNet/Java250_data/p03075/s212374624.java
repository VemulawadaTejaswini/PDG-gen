import java.util.*;

public class Main {
	static int a, b, c, d, e, k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        k = sc.nextInt();
        
        if(hoge()) {
        	System.out.println("Yay!");
        }else {
        	System.out.println(":(");
        }
	}
	
	static boolean hoge() {
		if(b - a > k) return false;
		else if(c - a > k) return false;
		else if(d - a > k) return false;
		else if(e - a > k) return false;
		else if(c - b > k) return false;
		else if(d - b > k) return false;
		else if(e - b > k) return false;
		else if(d - c > k) return false;
		else if(e - c > k) return false;
		else if(e - d > k) return false;
		return true;
	}
}
