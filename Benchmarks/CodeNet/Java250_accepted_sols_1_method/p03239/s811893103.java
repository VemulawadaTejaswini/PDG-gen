import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());

        String localMinC = "TLE";
        int c_; int t_;
        for(int i=0; i<n; i++){
            c_ = Integer.parseInt(sc.next());
            t_ = Integer.parseInt(sc.next());
            if (t_ <= t &&
                (localMinC.equals("TLE") ||
                Integer.parseInt(localMinC)>c_)) {
                localMinC = String.valueOf(c_);
            }
        }

        System.out.print(localMinC);

    }

}

