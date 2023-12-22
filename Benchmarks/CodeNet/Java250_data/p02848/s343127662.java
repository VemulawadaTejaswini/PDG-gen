import java.util.*;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[]ss = S.toCharArray();
 
        for(int i=0; i<S.length(); i++){
            if(ss[i]+N <= 90){
                ss[i]=(char)(ss[i]+N);
            }else{
                ss[i]=(char)(ss[i]+N-26);
            }        
        }         
            System.out.print(String.valueOf(ss));
        }
}
