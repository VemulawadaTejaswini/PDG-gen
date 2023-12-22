import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String S = sc.next();
        String mae = S.substring(0,k-1);
        String usiro = S.substring(k);
        char A = S.charAt(k-1);
        if(A == 'A'){
          A = 'a';
        }else if (A == 'B'){
          A = 'b';

        }else{
          A = 'c';
        }
        System.out.println(mae + A + usiro);
    }
}
