import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int l = S.length();
        int max = 0;
        String X ="ACGT";
        char A = X.charAt(0);
        char C = X.charAt(1);
        char G = X.charAt(2);
        char T = X.charAt(3);

        for(int i=0; i<l-1; i++){
            for(int j=i+2; j<=l; j++){
                String sub = S.substring(i, j);
                int lsub = sub.length();
                for(int k=0; k<lsub; k++){
                    if(sub.charAt(k)==A || sub.charAt(k)==C || sub.charAt(k)==G || sub.charAt(k)==T){
                        
                    }
                    else{
                        break;
                    }
                    if(k==lsub-1){
                        max = Math.max(max, lsub);
                    }
                }
            }
        }
        if(max>1){
            System.out.println(max);
        }

        else if(max==0){
            for(int i=0; i<l; i++){
                if(S.charAt(i)==A || S.charAt(i)==C || S.charAt(i)==G || S.charAt(i)==T){
                    max = 1; 
                    System.out.println(max);
                    break;
                }
            }
        }
        if(max==0){
            System.out.println(max);
        }
    }
}