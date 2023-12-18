import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = (int)(n / 1.08);
        int tmp2 = (int)(tmp * 1.08);
        if(n == (int)(tmp * 1.08)){
            System.out.println(tmp);
        } else if (n == (int)((tmp+1) * 1.08) ){
            System.out.println(tmp+1);
        } else if (n == (int)((tmp-1) * 1.08)){
            System.out.println(tmp-1);
        } else {
            System.out.println(":(");
        }
    }
}
