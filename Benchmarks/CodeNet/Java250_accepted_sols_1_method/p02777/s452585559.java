import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int numS = Integer.parseInt(sc.next());
        int numT = Integer.parseInt(sc.next());
        String U = sc.next();
        if(U.equals(S)){
            numS--;
        }else{
            numT--;
        }
        System.out.println(numS + " " + numT);
        }
}
