import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Ans = 0;
        String S = sc.next();
        char[] C = S.toCharArray();
        for (int i=0;i<4;i++){
            Ans += (C[i]=='+')? 1:-1;
        }
        System.out.println(Ans);
        sc.close();
    }
}