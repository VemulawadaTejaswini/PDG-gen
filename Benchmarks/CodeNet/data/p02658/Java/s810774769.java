import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        long sum=1;
        for(int i=0;i<N;i++){
            long A = Long.parseLong(scan.next());
            sum*=A;
        }
        if(sum>Math.pow(10,17)){
                System.out.println(-1);
                System.exit(0);
            }
        System.out.println(sum);
    }
}
