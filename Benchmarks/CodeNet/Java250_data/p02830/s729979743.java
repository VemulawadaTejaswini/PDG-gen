import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        String[] arrayS = s.split("");
        String[] arrayT = t.split("");
        
        for(int i=0;i<n;i++){
            System.out.print(arrayS[i]);
            System.out.print(arrayT[i]);
        }
    }
}
