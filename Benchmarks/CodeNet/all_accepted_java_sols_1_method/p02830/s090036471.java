import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        StringBuffer s = new StringBuffer();
        for(int i = 0;i<N;i++){
            s.append(S.charAt(i));
            s.append(T.charAt(i));
        }
        System.out.println(s);
    }
}
