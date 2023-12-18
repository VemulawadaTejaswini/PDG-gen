import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        int int_ans = a/b;
        int mod_ans = a%b;
        double float_ans = (double)a/b;
        System.out.printf("%d %d %f\n",int_ans,mod_ans,float_ans);
    }
}
