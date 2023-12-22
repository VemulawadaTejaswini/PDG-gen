import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		long K = sc.nextLong();
		
		
		int length = S.length();
		
		String one = "1";
		
		int flag = 0;
		int F = 0;
		int B = 1;
		long locate = 1;
		String Ma = "1";
		
		for (int count = 1; flag == 0 && count <= length; count++){
			String compareX = S.substring(F,B);
			if(one.equals(compareX)){
				F++;
				B++;
			}else {
				Ma = S.substring(F,B);
				locate = B;
				flag = 1;
			}
		}
		int ans = Integer.parseInt(Ma);
		
		
		if(K < locate){
			System.out.println(1);
		}
		else{
			System.out.println(ans);
		}
		
		
	}
}