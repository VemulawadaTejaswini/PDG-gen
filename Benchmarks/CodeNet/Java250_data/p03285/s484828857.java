import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n_7 = n/7;
        boolean flag = false;
        for(int i=0; i<=n/7; i++){
            int ans = n - (i*7);
            if(ans%4 == 0){
                flag = true;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
