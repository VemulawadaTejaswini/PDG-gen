import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();
		int S = sc.nextInt();
		int ans = 0;

		if(M1<=M2){
			ans = ((H2-H1)*60)+(M2-M1);
			ans -= S;
		}else{
			ans = (H2-H1-1)*60;
			ans += (60+M2)-M1;
			ans -= S;
		}
		System.out.println(ans);
	}
}
