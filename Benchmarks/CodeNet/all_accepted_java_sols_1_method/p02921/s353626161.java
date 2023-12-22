import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String T = sc.nextLine();

        sc.close();

        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        int cnt = 0;
        
        for (int i=0;i < 3;i++){
            if(s[i]==t[i]) 
                cnt++;
            
    
        }   
        
        System.out.println(cnt);
    }
       
}       