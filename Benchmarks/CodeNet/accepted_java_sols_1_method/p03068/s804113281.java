import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        char point = S.charAt(K-1);
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i) == point){
                System.out.print(S.charAt(i));
            }else{
                System.out.print("*");
            }
        }
    } 
}
