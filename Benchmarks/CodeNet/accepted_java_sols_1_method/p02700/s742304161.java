import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		long A_hp = sc.nextLong();
		long B_at = sc.nextLong();
		long C_hp = sc.nextLong();
		long D_at = sc.nextLong();
		String ans = "Yes";
		
		while ((A_hp>0)&(C_hp>0)) {
			C_hp=C_hp-B_at;
			if (C_hp>0) {
				A_hp=A_hp-D_at;	
			}
		}

		if (A_hp<=0) {
			ans="No";
		}
		System.out.println(ans);
		//System.out.print(ans);
		

    }
}


