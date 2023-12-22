import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = 0;
		if(n%2==0){
			p = n/2;
		}else{
			p = n/2 + 1;
		}

		System.out.println(p);
		sc.close();
	}
}
