import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
		String S = Integer.toString(N,K);
      
        System.out.println(S.length()); 
    }
}