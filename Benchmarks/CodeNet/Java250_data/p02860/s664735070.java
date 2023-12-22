import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String s = sc.next();
	    String S[] = s.split("");
	    if(N % 2 == 1) {
	        System.out.println("No");
	    }else {
	        for(int i = 0; i < N / 2; i++) {
	            if(S[i].equals(S[N / 2 + i])) {
	                if(i < N / 2 - 1) {
	                    continue;
	                }
	                System.out.println("Yes");
	            }else {
	                System.out.println("No");
	                break;
	            }
	        }
	    }
	}
}