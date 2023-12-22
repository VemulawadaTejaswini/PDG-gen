import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h = -10;
        int result = 0;
        for(int i = 0;i<n;i++){
            h = sc.nextInt();
            if(h>=k){
                result++;
            }
        }
        System.out.println(result);
        sc.close();
    }
}