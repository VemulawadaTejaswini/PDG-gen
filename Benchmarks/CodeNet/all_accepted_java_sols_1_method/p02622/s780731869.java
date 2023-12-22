import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        char[] Sarray = S.toCharArray();
        char[] Tarray = T.toCharArray();

        int result = 0;

        for(int i=0; i<Sarray.length; i++) {
            if(Sarray[i] != Tarray[i]) {
                result++;
            }
        }

        System.out.println(result);

    }
}