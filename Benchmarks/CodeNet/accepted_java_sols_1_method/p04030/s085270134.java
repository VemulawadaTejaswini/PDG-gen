import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String ans = "";
        int a=0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                ans=ans+0;
                a++;
            }else if(s.charAt(i)=='1'){
                ans=ans+1;
                a++;
            }else{
                if(a!=0){
                    ans=ans.substring(0,a-1);
                    a--;
                }
            }
        }
        
        System.out.println(ans);
   }
}
