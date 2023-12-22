import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int sum=0,opt = 999999999,opt_num=0;
        for(int i=1;i<=N;i++) {
            int num = L+i-1;
            sum+=num;
            if(opt>Math.abs(L+i-1)){
                opt = Math.abs(L+i-1);
                opt_num = L+i-1;
            }
        }
        System.out.println(sum-opt_num);
    }
}
