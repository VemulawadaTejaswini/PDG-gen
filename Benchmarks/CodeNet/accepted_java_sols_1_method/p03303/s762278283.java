import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String Slist[] = S.split("");
        int N =sc.nextInt();
        for(int i = 0; i < S.length(); i+=N){
            System.out.print(Slist[i]);
        }
        
        
    }
}
