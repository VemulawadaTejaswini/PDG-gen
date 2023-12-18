import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
      	int N,K;
      	String S;
      	N = sc.nextInt();
      	S = sc.next();
      	K = sc.nextInt();
      	char[] s = new char[N];
      	for (int i = 0; i < N; i++) {
        	s[i] = S.charAt(i);
        }
      	for(int i = 0;i < N; i++) {
        	if(s[K-1] != s[i]) {
              	s[i] = '*';
            }
        }
      	for(int i = 0; i < N; i++) {
        	System.out.print(s[i]);
        }
    }
}