// 2019/06/27
// AtCoder Beginner Contest 085 - A

import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input
       String s = sc.next();
       String ans;

        // Make string
       ans = "";
       for(int i=0; i<s.length(); i++){
           if(i==3){
               ans = ans + "8";
           } else {
ans = ans + s.charAt(i);
           }
       }
       
       // Output
       System.out.println(ans);
    }
}