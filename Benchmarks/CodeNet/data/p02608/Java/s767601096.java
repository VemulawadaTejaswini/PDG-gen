import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] res = new long[10001];
        for(int x=1; x<=100; x++) {
            for(int y=1; y<=100; y++) {
                for(int z=1; z<=100; z++) {
                    int num = x*x + y*y + z*z + x*y + y*z + z*x;
                    if(num > 10000) continue;
                    res[num]++;
                }
            }
        }
        for(int i=1; i<=n; i++) {
            System.out.println(res[i]);
        }

    }


}