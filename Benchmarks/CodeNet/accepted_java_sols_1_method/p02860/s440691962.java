import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        String S = sc.next();

        String tmp = S.substring(0, n/2) + S.substring(0, n/2);
        if(tmp.equals(S) && n%2 == 0)
            System.out.println("Yes");
        else System.out.println("No");
    }
}