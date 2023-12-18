import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
	int ans	= 0;
	int max	= 0;
	for(int i = 0; i<n; i++) {
            char c = s.charAt(i);
	    if(c=='I') {
                ans++;
	    } else {
                ans--;
            }
            max	= Math.max(ans,max);
	}
        System.out.println(max);
    }
}