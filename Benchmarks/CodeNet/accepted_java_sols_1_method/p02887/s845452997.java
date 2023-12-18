import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        sc.nextLine();

        String S = sc.nextLine();

        for(int i = 0; i < S.length()-1; i++) {
            if(a == 1)
              break;
            char currentChar = S.charAt(i);
            char nextChar = S.charAt(i+1);
            boolean same = (currentChar == nextChar);
            if(same) {
              a--;
            }
        }

        System.out.println(a);
    }
}