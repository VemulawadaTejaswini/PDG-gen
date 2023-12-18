import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), i, ans = 0;
        if(x > y){    
            for(i = 1; i <= x % y; i++){
                if((x%y)%i==0 && y%i==0)ans = i;
            }
        }else if (x < y){
            for(i = 1; i <= y % x; i++){
                if((y%x)%i==0 && x%i==0)ans = i;
            }
        }else{
            ans = x;
        }
        System.out.println(ans);
    }
}
