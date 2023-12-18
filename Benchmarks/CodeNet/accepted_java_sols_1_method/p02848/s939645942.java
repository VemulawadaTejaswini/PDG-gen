import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        for(int i=0; i<S.length(); i++){
            int tmp = S.charAt(i)+N;
            if(tmp > 90){
                tmp = S.charAt(i) - 26 + N ;
            }
            
            System.out.print((char)tmp);
        }
   }
}
