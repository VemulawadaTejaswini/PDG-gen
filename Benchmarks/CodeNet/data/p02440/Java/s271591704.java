import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] L = new long[n];
        for(int i=0;i<n;i++) L[i] = sc.nextLong();
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int b = sc.nextInt();
            int e = sc.nextInt();
            long opt = L[b];
            if(cmd==0){
                for(int j=b+1;j<e;j++) if(opt>L[j]) opt = L[j];
            }
            else {
                for(int j=b+1;j<e;j++) if(opt<L[j]) opt = L[j];
            }

            System.out.println(opt);
        }
    }
}
