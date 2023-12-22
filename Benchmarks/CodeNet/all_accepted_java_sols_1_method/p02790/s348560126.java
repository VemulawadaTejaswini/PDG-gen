import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = 0;
        if(a>b){
            for(int i = 0;i<a;i++){
                ans += b*(Math.pow(10,i));
            }
            System.out.println(ans);
        }
         if(a<=b){
            for(int i = 0;i<b;i++){
                ans += a*(Math.pow(10,i));
            }
            System.out.println(ans);
        }
    }
}
