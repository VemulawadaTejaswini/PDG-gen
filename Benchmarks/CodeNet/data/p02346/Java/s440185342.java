import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long [] L = new long[n];
        Arrays.fill(L,0);
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(cmd==0)L[x-1]+=y;
            else{
                long sum = 0;
                for(int j=x-1;j<y;j++)sum+=L[j];
                System.out.println(sum);
            }
        }
    }
}
