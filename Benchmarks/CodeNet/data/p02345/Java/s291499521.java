import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long ini = 2147483647;
        int n = sc.nextInt();
        int q = sc.nextInt();
        long [] L = new long[n];
        Arrays.fill(L,ini);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            int com = sc.nextInt();
            if(com==0){
                int x = sc.nextInt();
                long y = sc.nextLong();
                L[x] = y;
            }
            else{
                int x = sc.nextInt();
                int y = sc.nextInt();
                long min = ini;
                for(int j=x;j<=y;j++) if(min>L[j]) min = L[j];
                sb.append(min+"\n");
            }
        }
        System.out.print(sb);
    }
}
