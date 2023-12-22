import java.util.*;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int num = (int)Math.floor(Math.log10(n));
        
        int ans = 0;
        
        for(int i=2;i<num;i+=2){
            
            ans += 9 * Math.pow(10,i);
            
        }

        if(num%2==0 && num>0){
            ans += n - Math.pow(10,num) + 1;
        }

        if(n<10){
            ans += n;
        }else{
            ans += 9;
        }

        System.out.println(ans);

        sc.close();
    }
}