import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = Integer.parseInt(sc.next());
    	int b = Integer.parseInt(sc.next());

    	int ans = 0;

    	for (int i=a; i<=b; i++){
    		String string_i = String.valueOf(i);
    		StringBuffer sb = new StringBuffer(string_i);
    		if (string_i.equals(sb.reverse().toString())){
    			ans += 1;
    		}
    	}

    	System.out.println(ans);
    }
}