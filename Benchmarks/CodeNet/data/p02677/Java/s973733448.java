import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt(); //0~11
		int M = sc.nextInt(); //0~59
		double Mr = (double) M*6;
      	double Hr = H*30 + Mr/12;
		
		double diffr = 0.0;
		if(Hr>Mr){
			diffr = Hr - Mr;
		}else{
			diffr = Mr - Hr;
		}
		
		double ans = 0.0;
		if(diffr == 90){
			ans = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));
			System.out.println(ans);
			return;
		}
      
      	if(diffr == 180){
			System.out.println(A+B);
			return;
		}
      
      	if(diffr > 180){
			diffr = 360 - diffr;
		}

      	System.out.println(diffr);
      	System.out.println(Math.cos(Math.toRadians(diffr)));

		double mid = 2*(A*B)*Math.cos(Math.toRadians(diffr));
		ans = Math.sqrt(Math.pow(A,2) - mid + Math.pow(B,2));
		System.out.println(ans);
		return;

	}
}