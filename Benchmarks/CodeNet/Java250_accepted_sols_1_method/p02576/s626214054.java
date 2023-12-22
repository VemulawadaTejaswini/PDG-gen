import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
        int x = sc.nextInt();
		int t = sc.nextInt();
        int ans = 0;
        int count = 0;
        while(count<n){count+=x;
                       ans+=t;                            
                      }       
		System.out.println(ans);
	}
}