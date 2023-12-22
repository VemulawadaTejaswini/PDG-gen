import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int tmp = D*2+1;
        if(N%tmp==0) {
        	int ans = N/tmp;
        	System.out.println(ans);
        }else {
        	int ans = (N/tmp)+1;
        	System.out.println(ans);
        }


	}

}