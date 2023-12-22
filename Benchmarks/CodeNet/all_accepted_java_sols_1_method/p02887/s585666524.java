import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int slime=1;
        for(int n=1; n<N; n++) if(S.charAt(n-1)!=S.charAt(n)) slime++;
        System.out.println(slime);
    }
}
