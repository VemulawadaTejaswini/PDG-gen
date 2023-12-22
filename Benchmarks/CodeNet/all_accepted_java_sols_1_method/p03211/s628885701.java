import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = 999;
        
        for(int i=0; i<str.length()-2; i++){
            String str2 = str.substring(i,i+3);
            int N = Integer.parseInt(str2);
            //System.out.println(N);
            if(ans > Math.abs(753-N)){
                ans = Math.abs(753-N);
            }
        }
        System.out.println(ans);
    }
}
