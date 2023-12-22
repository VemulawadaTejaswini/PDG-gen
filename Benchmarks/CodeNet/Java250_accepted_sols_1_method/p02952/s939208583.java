import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans;
        
        if(n<10) ans = n;
        else if(n<100) ans = 9;
        else if(n<1000) ans = n-99+9;
        else if(n<10000) ans = 999-(99-9);
        else if(n<100000) ans = n-9999+999-(99-9);
        else ans = 99999-(9999-(999-(99-9)));
        
        System.out.println(ans);
    }
}
