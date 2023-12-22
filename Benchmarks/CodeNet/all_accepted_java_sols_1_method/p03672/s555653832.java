import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        sc.close();

        int max = 0;

        for(int i = 1; i < S.length(); i++){
            if((S.length()-i) % 2 != 0)
                continue;
            else{
                if(S.substring(0,(S.length()-i)/2).equals(S.substring((S.length()-i)/2, S.length()-i))){
                    max = Math.max(S.length()-i, max);
                    break;
                }
            }
        }
        System.out.println(max);
    }
}