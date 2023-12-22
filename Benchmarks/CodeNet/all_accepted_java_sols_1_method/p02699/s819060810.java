import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        if (N <= M)
        	System.out.println("unsafe");
        else
        	System.out.println("safe");
        	

	}
}
