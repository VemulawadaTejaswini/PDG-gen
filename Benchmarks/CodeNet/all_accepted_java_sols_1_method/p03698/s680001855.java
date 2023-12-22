import java.util.*;
  
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
     
        int[] alph = new int[26];
        int tmp;
        boolean answer = false;
        for(int i = 0; i<26; i++)
            alph[i] = 0;
            
        String S = sc.next();
        
        for(int i = 0; i<S.length(); i++){
            if(S.charAt(i) == 'a')
                alph[0]++;
            else{
                tmp = (int) S.charAt(i) - 'a';
                alph[tmp]++;
            }
        }
        
        for(int i =0; i<alph.length; i++){
            if(alph[i] > 1)
                answer = true;
        }
        if(answer == false)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}