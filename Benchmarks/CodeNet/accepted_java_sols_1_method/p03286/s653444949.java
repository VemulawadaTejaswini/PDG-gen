import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int RADIX = -2;
        StringBuilder res=new StringBuilder();

        if(N==0){
            System.out.println(0);
        }else {
            while (N != 0) {
                if (N % RADIX < 0) {
                    res.append(1);
                    N = 1 + N / RADIX;
                } else {
                    res.append(N % RADIX);
                    N = N / RADIX;
                }
            }
            System.out.println(res.reverse().toString());
        }
    }
}
