import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int x = 0;
        if(S.equals("RRR")) x = 3;
        else if(S.equals("RRS")) x = 2;
        else if(S.equals("SRR")) x = 2;
        else if(S.equals("RSR")) x = 1;
        else if(S.equals("RSS")) x = 1;
        else if(S.equals("SSR")) x = 1;
        else if(S.equals("SRS")) x = 1;
        
        System.out.println(x);
    }
}
