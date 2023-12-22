import java.util.*;
 
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    String line = sc.next();
	    String[] s = line.split("");
	    int sum = 1;
	    for(int i = 1; i < N; i++) {
	        if(s[i].equals(s[i-1])) {
	            continue;
	        }else {
	            sum++;
	        }
	    }
	    System.out.println(sum);
	}
}