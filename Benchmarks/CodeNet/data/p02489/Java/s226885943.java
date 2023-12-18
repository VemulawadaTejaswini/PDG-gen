import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		
		int count = 1;
        
        while (x != 0) {
    		System.out.println("Case " + count + ": " + x);
        	x = sc.nextInt();
    		count++;
        }

	}

}