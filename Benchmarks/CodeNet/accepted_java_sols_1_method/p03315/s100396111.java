
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String arg=sc.next();
        int ANS=0;
        
        for(int i=0;i<4;i++){
            if(arg.charAt(i)=='+'){
                ANS++;
            }else{
                ANS--;
            }
        }
        
        System.out.println(ANS);
    }
}