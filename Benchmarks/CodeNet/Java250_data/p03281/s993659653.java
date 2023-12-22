import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int ans = -1+1;
		
		for(int i =1; i<=n; i++) {
			for(int j = 1; j<=i; j++) {
				if(i%j ==0) {
					count +=1;
				}
			}
			if(count==8) {
				ans +=1;
			}
			count = 0;
			i++;
		}
		System.out.println(ans);
	}

}
