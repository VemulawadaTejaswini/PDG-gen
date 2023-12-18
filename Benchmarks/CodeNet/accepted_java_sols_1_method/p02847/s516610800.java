import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S;
        String[] T ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        S = sc.next();
        for(int i=0;i<7;i++)if(S.equals(T[i]))System.out.println(7-i);
    }
}
