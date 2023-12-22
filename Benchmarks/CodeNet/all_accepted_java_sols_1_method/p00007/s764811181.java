import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        long ans = 100000;
        
        n = sc.nextInt();
        for(int i=0;i<n;i++){
	      	ans = ans+(ans/20);
		    if(ans%1000>1){
		    	ans /= 1000;
		    	ans *= 1000;
		    	ans += 1000;
		    }
        }        
        System.out.println(ans);
    }
}