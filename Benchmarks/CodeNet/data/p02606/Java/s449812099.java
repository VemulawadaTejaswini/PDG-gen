import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int L,R,d;
        Scanner scan = new Scanner(System.in);
        L = scan.nextInt();
        R = scan.nextInt();
        d = scan.nextInt();
        for(int i = L;i<R+1;i++){
            if(i%d==0)System.out.println(i);
        }
    }
}