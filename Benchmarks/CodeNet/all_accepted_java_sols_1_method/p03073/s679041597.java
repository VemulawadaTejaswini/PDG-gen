import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result = 0;
        int kari = 0;
        for(int i = 0;i<s.length();i++){
            if(i%2==0 && s.charAt(i) == '0'){
                kari++;
            }else if(i%2==1 && s.charAt(i) == '1'){
                kari++;
            }
        }
        for(int i = 0;i<s.length();i++){
            if(i%2==0 && s.charAt(i) == '1'){
                result++;
            }else if(i%2==1 && s.charAt(i) == '0'){
                result++;
            }
        }
        if(kari<result){result = kari;}
        System.out.println(result);
        sc.close();
    }
}