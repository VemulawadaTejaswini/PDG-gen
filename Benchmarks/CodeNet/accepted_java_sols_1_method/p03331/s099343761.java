import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        if(n % 10 == 0){
        	System.out.println(10);
        }else{
        	String s = Integer.toString(n);
            int ans = 0;
            for(int i = 0; i < s.length(); i++){
            	int a = Integer.parseInt(s.substring(i, i + 1));
                ans += a;
            }
            System.out.println(ans);
        }
    }
}