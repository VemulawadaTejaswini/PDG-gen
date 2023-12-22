import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int ans=0;
		if(X%(Y+Z)>=Z) {
			ans=X/(Y+Z);
		}else {
			ans=X/(Y+Z)-1;
		}
		System.out.println(ans);
	}

}
