import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String  S= sc.next();
		String ans="Yes";
		if(N%2==1){
			ans="No";
			System.out.println(ans);
		}
		else{
			for(int i=0;i<=N/2-1;i++){
				if(S.charAt(i)!=S.charAt(i+(N/2))){
					ans="No";
				}
			}
		System.out.println(ans);
		}
    }
}