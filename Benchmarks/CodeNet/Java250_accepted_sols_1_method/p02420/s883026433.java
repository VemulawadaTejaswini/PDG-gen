import java.util.Scanner;

public class Main{
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        while(!s.equals("-")){
            int m = scanner.nextInt();
            for(int i = 0; i < m; i++){
                int n = scanner.nextInt();
                int l = s.length();
                String tmp1 = s.substring(0, n);
                String tmp2 = s.substring(n, l);
                s = tmp2 + tmp1;
            }
            System.out.println(s);
            s = scanner.next();
        }
    }
}

