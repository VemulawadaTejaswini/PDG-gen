import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int ans= 0;
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		if (K<=A) {
			ans=K;
		}
		else{
			if (A<K&&K<=A+B) {
				ans=A;
			}
			else{
				ans=A-(K-(A+B));
			}
		
		}
		System.out.println(ans);
		//System.out.print(ans);
		

    }
}