import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//n角形のnの取得
		int n = scan.nextInt();
        int ans = (n-2) * 180;
        	System.out.println(ans);
    		scan.close();
	}
	
}
