import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) throws Exception{    
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans;
        
        if(n <= k){
        	ans = n*x;
        }else{
        	ans = k*x + (n-k)*y;
        }
        
        System.out.println(ans);
        
        sc.close();
    }
 
}