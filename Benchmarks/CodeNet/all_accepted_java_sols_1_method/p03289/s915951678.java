import java.util.*;

public class Main{
    public static void main(String args[]){
        boolean ans = true;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ccnt = 0;
        char c = 'a';
        
        for(int i=0; i<s.length(); i++){
            c = s.charAt(i);
            if(i==0){
                if(c != 'A'){
                    ans = false;
                    break;
                 }
            }else if(i > 1 && i < s.length()-1){
                if(c == 'C' && ccnt == 0){
                    ans = true;
                    ccnt++;
                }else{
                    if(Character.isUpperCase(c)){
                        ans = false;
                        break;
                    }
                }
            }else{
                if(Character.isUpperCase(c)){
                    ans = false;
                    break;
                }
            }
            if(ccnt == 0){
                ans = false;
            }
        }

        System.out.println(ans?"AC":"WA");
    }
}