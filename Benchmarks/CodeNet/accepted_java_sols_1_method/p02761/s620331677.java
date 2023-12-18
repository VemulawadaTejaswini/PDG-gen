import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] Ss = new int[M];
        int[] Cs = new int[M];
        for (int m = 0; m < M; m++){
            Ss[m] = sc.nextInt();
            Cs[m] = sc.nextInt();
        }

        int[] text = new int[N];
        int noFlg = 0;
        for (int m = 0; m < M; m++){
            if (((Ss[m]-1) == 0) && (Cs[m] == 0) && (N>1)) {
                noFlg = 1;
                break;
            }
            if ((text[Ss[m]-1] != 0) && (text[Ss[m]-1] != Cs[m])) {
                noFlg = 1;
                break;
            }
            text[Ss[m]-1] = Cs[m];
        }
        StringBuilder sb = new StringBuilder();
        for (int t: text) {
            sb.append(String.valueOf(t));
        }
        String ans_text = sb.toString();
        if ((ans_text.length() > 1) && (ans_text.charAt(0) == '0')) {
            ans_text = ans_text.replaceFirst("0","1");
        }
        if (noFlg == 1) System.out.println("-1");
        else System.out.println(ans_text);
    }
}
