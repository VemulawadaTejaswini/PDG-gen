import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int eCnt = 0;
        for(int i = 1; i < s.length(); i++)
        	if(s.charAt(i) == 'E') eCnt++;

        int[] ws = new int[n];
        int[] es = new int[n];
        ws[0] = 0;
        es[0] = eCnt;

        for(int i = 1; i < n; i++) {
        	char c = s.charAt(i-1);
        	if(c == 'W') 
        		ws[i] = ws[i-1] + 1;
        	else
        		ws[i] = ws[i-1];
        	c = s.charAt(i);
        	if(c == 'E')
        	    es[i] = es[i-1] - 1;
        	else
        	    es[i] = es[i-1];
        }
        int min = n-1;
        for(int i = 0; i < n; i++) {
        	min = Math.min(min, ws[i] + es[i]);
        }
        System.out.println(min);
    }
}
