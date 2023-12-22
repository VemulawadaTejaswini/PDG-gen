import java.util.*;

class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuffer T = new StringBuffer(sc.next());

        T.append(S);
        System.out.println(T);
    }
}