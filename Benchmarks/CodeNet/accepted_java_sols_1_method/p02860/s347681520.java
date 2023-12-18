import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S  = sc.next();
        char[]ss = S.toCharArray();

        int cou = 0;
        for(int i=0; i<S.length()/2; i++){
            if(ss[i]!=ss[i+S.length()/2]){
                cou++;
            }
}
        if(N%2!=0){
            System.out.print("No");
        }else if(cou==0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        }
     }
