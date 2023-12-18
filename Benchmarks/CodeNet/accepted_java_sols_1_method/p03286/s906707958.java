
import java.util.Scanner;

// 基数変換　to-2進数
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "";

        while(N != 0) {
            int r = N % 2;
            if(r < 0) r += 2;
            N = (N - r) / (-2);

            s += r;
        }
        StringBuffer sb = new StringBuffer(s);
        String str = sb.reverse().toString();

        if(str.isEmpty()){
            str = "0";
        }
        System.out.println(str);
    }
}
