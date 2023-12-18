import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int res=1;
        for(int i=0;i<N;i++) {
            int A = scan.nextInt();
            res=res*A;
        }
        if(res<=Math.pow(10,18)){
            System.out.println(res);
        }
        else{
            System.out.println("-1");
        }
    }
}
