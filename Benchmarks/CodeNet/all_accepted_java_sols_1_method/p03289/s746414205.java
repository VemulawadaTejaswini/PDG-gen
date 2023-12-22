import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        String ans = "AC";
        if(s[0]!='A'){
            ans = "WA";
        }
        if(Character.isUpperCase(s[1])){
            ans = "WA";
        }
        int count = 0;
        for(int i =2;i<s.length;i++){
            if(Character.isUpperCase(s[i])){
                if(count==0&&s[i]=='C'&&i!=s.length-1){
                    count ++;
                } else {
                    ans = "WA";
                }
            }
        }
        if(count==0){
            ans ="WA";
        }
        System.out.println(ans);
    }
}