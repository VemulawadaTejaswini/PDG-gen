import java.util.*;
public class Main {
	//定義関数から参照できる変数定義はこの辺
	static int N;
	static int M;
	static int Left_max=-1;
	static int Right_min=100001;

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		for(int i=1;i<=M;i++){
			Left_max=Math.max(Left_max,sc.nextInt());
			Right_min=Math.min(Right_min,sc.nextInt());
		}


		if (Left_max<=Right_min) {
			System.out.println(Right_min-Left_max+1);
		}
		else{

			System.out.println(0);

		}

		//System.out.print(ans);
    }
}