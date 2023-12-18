import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int S = input.nextInt();
        int h,m,s;
        h = S/3600;
        m = (S/60)%60;
        s = S%60;
        System.out.printf("%d:%d:%d\n",h,m,s);
    }
}
