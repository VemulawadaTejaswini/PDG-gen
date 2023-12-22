import java.math.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        String ans = "DENIED";
        outloop:for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
            if(a[i]%2==0){
                if(a[i]%3==0||a[i]%5==0){
                    ans = "APPROVED";
                } else {
                    ans = "DENIED";
                    break outloop;
                }
            } else {
                ans = "APPROVED";
            }
        }
        System.out.println(ans);
    }
}
