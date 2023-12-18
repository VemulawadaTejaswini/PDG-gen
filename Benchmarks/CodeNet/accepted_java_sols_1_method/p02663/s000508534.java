import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
		
		int h1 =sc.nextInt();
		int m1 =sc.nextInt();
        
        int h2 =sc.nextInt();
        int m2 =sc.nextInt();
        int k =sc.nextInt();
        
        int ans=0;
        
        ans=(60*(h2-h1)+(m2-m1) -k);
        
        System.out.println(ans);
    }
}
