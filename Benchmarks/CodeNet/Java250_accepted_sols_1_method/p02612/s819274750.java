import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int  n = in.nextInt();
		int  rem = n%1000;
	//	int div = n%1000;
		if(n%1000==0){
			System.out.println(0);
			}
			else{
				int div = n/1000+1;
				int ans= div*1000 - n;
					System.out.println(ans);
				}
	
	}
}