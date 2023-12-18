import java.util.Scanner;

// 6
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		
		long ans = 1;
		
		if(H == 1 || W == 1) ;
		else if(H % 2 == 0)
			ans = (H / 2) * W;
		else {
			if(W % 2 == 0)
				ans = H * (W / 2);
			else
				ans = ((W - 1) / 2) * H + (long)Math.ceil(H / 2.0);
		}
		
		System.out.println(ans);
	}

}
