import java.util.*;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	char[] s = sc.next().toCharArray();
      	char[] t = sc.next().toCharArray();
      
      	StringBuilder sb = new StringBuilder();
      	for (int i = 0; i < n; i++) {
        	sb.append(s[i]);
        	sb.append(t[i]);
        }
      	System.out.println(sb);
    }
}