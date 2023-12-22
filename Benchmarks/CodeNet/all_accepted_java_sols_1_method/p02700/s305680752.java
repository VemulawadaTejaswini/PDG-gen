import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int T_time = (A-1)/D+1;
        int A_time = (C-1)/B+1;

        
        if (T_time < A_time)
        	System.out.println("No");
        else
        	System.out.println("Yes");
        

	}
}
