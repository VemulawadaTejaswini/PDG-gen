import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 文字列の長さ
	    String A = sc.next(); 
		String B = sc.next(); 
		String C = sc.next(); 

        int returnCount = 0;
        for (int i = 0; i < N; i++) {
            char cA = A.charAt(i);
            char cB = B.charAt(i);
            char cC = C.charAt(i);
            int count = 0;
            if (cA != cB) count++;
            if (cB != cC) count++;
            if (cC != cA) count++;
            
            if (count == 3) {
                returnCount += 2;
            } else if (count == 2) {
                returnCount += 1;
            }
        }
		
        System.out.println(returnCount);
	}
}