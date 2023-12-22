import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        String T = sc.nextLine();

        int Sl = S.length();
        int Tl = T.length();
        int min = 1000;

        for(int i = 0; i < (Sl-Tl+1); i++) {
            char[] Schr = S.toCharArray();
            char[] Tchr = T.toCharArray();
            int tmp = 0;
            for (int j = 0; j < Tl; j++) {
                if (Schr[j + i] == Tchr[j]) {
                    tmp++;
                }
            }
            tmp = Tl - tmp;
            if(tmp < min){
                min = tmp;
            } else if(tmp == 0) {
                break;
            }
        }
        System.out.println(min);
    }
}