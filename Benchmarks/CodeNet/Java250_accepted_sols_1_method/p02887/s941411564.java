import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int ans = 0;
        
        for(int i=1; i<N; i++){
            if(str.charAt(i-1) != str.charAt(i)){
                ans++;
            }
            //System.out.println(i);
        }
        System.out.println(ans+1);
    }
}
