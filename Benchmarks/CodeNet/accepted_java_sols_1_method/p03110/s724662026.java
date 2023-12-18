import java.util.*;

public class Main{
    static final long bairitsu = 100000000L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = 0;
        for(int i=0; i<N; i++) {
            String val = sc.next();
            String type = sc.next();
            switch(type) {
                case "JPY":
                    long l_tmp = Long.parseLong(val);
                    result += l_tmp * bairitsu;
                    break;
                case "BTC":
                    double d_tmp = Double.parseDouble(val);
                    long hoge = (long)(d_tmp * bairitsu * 380000L);
                    result += hoge;
                    break;
            }
        }
        double f_result = ((double)result) / bairitsu;
        System.out.println(f_result);
    }
}