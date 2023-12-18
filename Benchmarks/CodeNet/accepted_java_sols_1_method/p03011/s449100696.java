import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int ab = sc.nextInt();
		int bc = sc.nextInt();
		int ca = sc.nextInt();
        
        int result1 = ab + bc;
        int result2 = bc + ca;
        int result3 = ca + ab;

        int min = result1;
        if (min > result2) {
            min = result2;
        }
        if (min > result3) {
            min = result3;
        }
		// 出力
		System.out.println(min);
	}
}