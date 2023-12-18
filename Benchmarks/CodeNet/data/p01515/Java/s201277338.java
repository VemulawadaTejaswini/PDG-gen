import java.util.*;

public class Main{
    static String solve(String s){
        while(s.length() != 1){
            s = s.replaceAll("\\(F\\+F\\)", "F");
            s = s.replaceAll("\\(F\\+T\\)", "T");
            s = s.replaceAll("\\(T\\+F\\)", "T");
            s = s.replaceAll("\\(T\\+T\\)", "T");

            s = s.replaceAll("\\(F\\*F\\)", "F");
            s = s.replaceAll("\\(F\\*T\\)", "F");
            s = s.replaceAll("\\(T\\*F\\)", "F");
            s = s.replaceAll("\\(T\\*T\\)", "T");

            s = s.replaceAll("\\(F\\->F\\)", "T");
            s = s.replaceAll("\\(F\\->T\\)", "T");
            s = s.replaceAll("\\(T\\->F\\)", "F");
            s = s.replaceAll("\\(T\\->T\\)", "T");

            s = s.replaceAll("\\-T", "F");
            s = s.replaceAll("\\-F", "T");
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            String ts = sc.next();
            if(ts.equals("#")) break;

            String[] s = ts.split("=");
            boolean flg = true;

            for(int bit = 0; bit < (1 << 11); bit++){
                String L = s[0];
                String R = s[1];

                for(int j = 0; j < 11; j++){
                    String tmp = "" + (char)('a' + j);

                    if((bit & (1 << j)) != 0){
                        L = L.replaceAll(tmp, "T");
                        R = R.replaceAll(tmp, "T");
                    }
                    else{
                        L = L.replaceAll(tmp, "F");
                        R = R.replaceAll(tmp, "F");
                    }
                }

                String ansL = solve(L);
                String ansR = solve(R);

                if(!ansL.equals(ansR)){
                    flg = false;
                    break;
                }
            }

            if(flg){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}