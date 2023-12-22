import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();
		
	    String[] li = S.split(""); 
	    String point = li[K-1];
	    
	    for(int i=0;i<N;i++) {
	    	if(!(li[i].equals(point))) {
	    	li[i] = "*";
	    	}
	    }
	    String A = String.join("",li);
	    System.out.println(A);
	}
}