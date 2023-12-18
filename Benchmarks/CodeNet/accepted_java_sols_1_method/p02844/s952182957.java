import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        final String S = sc.next();
        sc.close();

        int cnt = 0;
        for (int i=0; i<10; i++) {
            if (S.indexOf(Integer.toString(i))>-1) {
                String T = S.substring(S.indexOf(Integer.toString(i))+1);
                for (int j=0; j<10; j++) {
                    if (T.indexOf(Integer.toString(j))>-1) {
                        String U = T.substring(T.indexOf(Integer.toString(j))+1);
                        for (int k=0; k<10; k++) {
                            if (U.indexOf(Integer.toString(k))>-1) {
                                cnt++;
                            }
                        }
                    }
                }
    
            }
        }

        System.out.println(cnt);
    }
}