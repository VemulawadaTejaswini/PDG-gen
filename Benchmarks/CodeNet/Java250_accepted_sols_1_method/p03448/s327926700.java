import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int sum = 0;
        int ans = 0;

        for(int i=0; i<=A; i++){
            for(int j=0; j<=B; j++){
                for(int k=0; k<=C; k++){
                    sum = 500 * i + 100 * j + 50 * k;
                    if(sum==X){
                        ans += 1;
                    }
                    sum = 0;
                }
            }
        }
        System.out.println(ans);
    } 
}