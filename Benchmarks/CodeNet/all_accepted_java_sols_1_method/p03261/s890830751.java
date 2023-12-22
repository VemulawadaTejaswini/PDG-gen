import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int I = scan.nextInt();
        String tmp;
        boolean b = true;
        String[] s = new String[100];
        s[0] = scan.next();
        tmp = s[0].substring(s[0].length() - 1);
        for (int i = 1; i < I; i++) {
            s[i] = scan.next();
            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j])) {
                    b = false;
                    break;
                }
            }
            if (!s[i].startsWith(tmp)) {
                b = false;
                break;
            }
            tmp = s[i].substring(s[i].length() - 1);
        }
        if(b == false){
                System.out.println("No");
                System.exit(0);
        }
        System.out.println("Yes");
    }
}