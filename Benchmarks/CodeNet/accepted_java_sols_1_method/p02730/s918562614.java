import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        sb1.append(S);

        for (int i = 0; i < ((S.length()-1)/2); i++) {
            sb2.append(S.charAt(i));
        }

        for (int i = 0; i < ((S.length()-1)/2); i++) {
            sb3.append(S.charAt((S.length()+1)/2 + i));
        }

        if (sb1.toString().equals(sb1.reverse().toString()) &&
                sb2.toString().equals(sb2.reverse().toString()) &&
                sb3.toString().equals(sb3.reverse().toString()))
        {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

        sc.close();
    }


}