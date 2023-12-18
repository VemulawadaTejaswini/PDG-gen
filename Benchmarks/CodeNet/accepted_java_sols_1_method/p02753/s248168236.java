import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = 0;
        int b = 0;
        for (int i = 0 ; i < S.length(); i++){
            if (S.charAt(i) == 'A')
                a ++;
            else
                b ++;
        }
        System.out.println(a > 0 && b > 0 ? "Yes" : "No");
        sc.close();
    }
}
