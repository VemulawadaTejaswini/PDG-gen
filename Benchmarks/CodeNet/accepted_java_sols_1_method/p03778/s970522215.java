import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = 0;
        
        if(a >= b){
            ans = a-(b+w);
        }else{
            ans = b-(a+w);
        }
        
        if(ans < 0){
            ans = 0;
        }
        
        System.out.println(ans);
    }
}