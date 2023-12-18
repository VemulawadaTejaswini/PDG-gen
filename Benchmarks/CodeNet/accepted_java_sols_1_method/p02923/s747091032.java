import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;//答え
        int temp = 0;
        long p = 0;
        for (int i=0;i<N;i++){
            long h = sc.nextLong();
            if (p >= h){
                temp++;
                
            }else{
                if (ans<temp){
                    ans = temp;
                }
                temp = 0;
            }
            p = h;
        }
        if (ans<temp){
                ans = temp;
            }
        System.out.printf("%d\n",ans);
    }
}
