import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	
	if(n!=m && (n-m != 1 && m-n != 1)) {
	    System.out.println(0);
	    return;
	}
	

	long ans = 1;
	for(int i = 1; i<=Math.max(n,m); i++) {
	    ans *= i;
	    ans = ans % ((long)Math.pow(10,9)+7);
	}
	for(int i = 1; i<=Math.min(n,m); i++) {
	    ans *= i;
            ans = ans % ((long)Math.pow(10,9)+7);
        }
	if(n == m) {
	    ans *= 2;
	    ans = (long)(ans%((long)Math.pow(10,9)+7));
	    System.out.println(ans);
	}else {
	    System.out.println(ans);
	    
	}
	
	
	
    }
}