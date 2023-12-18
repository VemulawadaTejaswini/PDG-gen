import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int max = 0;
        int kari = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='I'){
                kari++;
            }else{
                kari--;
            }
            if(kari>max){
                max = kari;
            }
        }
        System.out.println(max);
        sc.close();
    }
}