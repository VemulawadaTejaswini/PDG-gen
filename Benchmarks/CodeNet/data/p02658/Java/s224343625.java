import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] L = new long[n];
        long sum = 1;
        for(int i=0;i<n;i++){
            L[i]= sc.nextLong();
            if(L[i]==0) sum = 0;
        }
        if(sum!=0) {
            String lim = "1000000000000000001";
            for (int i = 0; i < n; i++) {
                long lim2 = Long.parseLong(lim);
                if(sum*L[i]>=lim2){
                    sum=-1;
                    break;
                }
                else sum*=L[i];
            }
        }
        System.out.println(sum);
    }
}