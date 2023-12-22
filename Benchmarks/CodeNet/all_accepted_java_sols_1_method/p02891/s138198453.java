import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        long tot = 0;
        if (s.length() == 1) System.out.println(k/2);
        else if (s.length() == 2){
            if (s.charAt(0) == s.charAt(1)) System.out.println(k);
            else System.out.println(0);
        }
        else {
            boolean same = true;
            for (int i=1; i<s.length(); i++){
                if (s.charAt(i) != s.charAt(i-1)) same = false;
            }
            if (same) {
                tot = s.length();
                tot *= k;
                tot /= 2;
                System.out.println(tot);
            }
            else {
                int cont = 0;
                boolean first = true;
                int firstCont = 0;
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        cont++;
                    } else {
                        if (first) {
                            first = false;
                            firstCont = cont;
                        }
                        tot += (cont + 1) / 2;
                        cont = 0;
                    }
                }
                tot += (cont + 1) / 2;
                tot *= k;
                if (s.charAt(0) == s.charAt(s.length() - 1) && (cont+firstCont) % 2 == 0) tot += k - 1;
                System.out.println(tot);
            }
        }
    }
}
