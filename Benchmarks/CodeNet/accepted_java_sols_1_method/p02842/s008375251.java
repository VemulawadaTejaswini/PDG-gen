import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = Integer.parseInt(sc.next());
        sc.close();

        boolean f = false;
        int i = 0;
        for (i=N; i>0; i--) {
            int M = (int)(i*1.08);
            if (N==M) {
                f=true;
                break;
            } else if (N>M) {
                break;
            }
        }
        if (f) 
            System.out.println(i);
        else
            System.out.println(":(");
    }
}