import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		//String word_before = sc.next();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		while (N/K!=0) {
			N=	N/K;
			cnt++;
		}
		
		System.out.println(cnt+1);
      	sc.close();
    }
		
		
}