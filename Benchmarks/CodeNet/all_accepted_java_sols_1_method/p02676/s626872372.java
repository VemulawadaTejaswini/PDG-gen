import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int K = sn.nextInt();
        String S = sn.next();
        String result = "";
        
        if(K < S.length()){
            for(int i=0; i<K; i++){
                result = result + S.substring(i,i+1);
            }
            result = result + "...";
            System.out.println(result);
        }else{
            System.out.println(S);
        }

        
    }
}