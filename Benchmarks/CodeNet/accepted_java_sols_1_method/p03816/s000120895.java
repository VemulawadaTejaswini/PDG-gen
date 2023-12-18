import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[100000];
        for(int i = 0; i < n; i++){
            x[sc.nextInt() - 1]++;
        }
        int all = 0, cnt = 0;
        for(int i = 0; i < 100000; i++){
            if(x[i] > 0){
                all++;
                if(x[i] % 2 == 0){
                    cnt++;
                    cnt %= 2;
                }
            }
        }
        System.out.println(all - cnt);
    }
}