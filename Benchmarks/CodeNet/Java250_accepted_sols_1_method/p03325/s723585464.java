import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0;i<n;i++){
            int a = sc.nextInt();
            while(a%2==0){
                result++;
                a = a / 2;
            }
        }
        System.out.println(result);
        sc.close();
    }
}