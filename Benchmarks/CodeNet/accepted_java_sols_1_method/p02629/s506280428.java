import java.util.*;
  
public class Main{
    public static void main(final String[] args){
       
        final Scanner sc = new Scanner(System.in);

        String abc = "abcdefghijklmnopqrstuvwxyz";
        Long alf = 26l;
        Long N = sc.nextLong();
        String ans = "";

        for(;N>0;){
            Long Num = N-1;
            int tStr = (int)(Num%alf);
            ans = abc.substring(tStr,tStr+1)+ans;
            N =  Num/alf;
        }
        System.out.println(ans);
    }
}