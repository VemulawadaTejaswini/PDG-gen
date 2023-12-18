import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        long x=Long.parseLong("1000000000000000000");
        long sum=1;
        for(int i=0;i<N;i++){
            long A = Long.parseLong(scan.next());
            if(A==0){
                System.out.println(0);
                System.exit(0);
            }
            if(sum>x){
                System.out.println(-1);
                System.exit(0);
            }
            sum*=A;
        }
        System.out.println(sum);
    }
}
