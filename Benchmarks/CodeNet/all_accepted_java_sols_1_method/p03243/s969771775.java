import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        
        boolean big = false;
        for(int i=1;i<n.length();i++){
            if(n.charAt(i)>n.charAt(0)){
                big=true;
                break;
            }
        }
        
        String ans = "";
        if(big){
            for(int i=0;i<n.length();i++){
                ans+=(char)(n.charAt(0)+1);
            }
        }
        else{
            for(int i=0;i<n.length();i++){
                ans+=n.charAt(0);
            }
        }
        
        System.out.println(ans);
        
    }
}
/*
112
*/