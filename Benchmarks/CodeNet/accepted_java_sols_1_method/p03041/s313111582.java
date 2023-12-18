import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,K;
        String S;
        N = sc.nextInt();
        K = sc.nextInt();
        S = sc.next();
        String[] array = S.split("",0);
        for (int i = 0; i < N; i++) {
            if (i==K-1) array[i] = array[i].toLowerCase();            
            System.out.print(array[i]);
        }
    }
}