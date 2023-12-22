import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char C = N.charAt(0);

        String alphabetList = "abcdefghijklmnopqrstuvwxyz";

        char[] Sc = alphabetList.toCharArray();
        char ans='z';

        for(int i=0; i<Sc.length; i++){
            if(C == Sc[i] && C != 'z'){
                ans = Sc[i+1];
            }
        }

        System.out.println(ans);

    }
}

