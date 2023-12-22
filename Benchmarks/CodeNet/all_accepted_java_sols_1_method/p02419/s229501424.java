import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
    	int i, j, k;
    	int count = 0;
    	String w = sc.next();
    	w = w.toLowerCase();
    	while(true) {
    		String t = sc.next();
    		if(t.contains("END_OF_TEXT")) break;
    		t = t.toLowerCase();
    		if(t.equals(w)) count++;
    	}
    	System.out.println(count);
    }
}
