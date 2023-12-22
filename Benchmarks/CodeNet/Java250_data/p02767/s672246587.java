import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //消費コストが常に0以上なので、最小となるのは1から100の間　全探索すればいい
        int N=sc.nextInt();
        int[] X=new int[N];
        for(int i=0; i<N; i++){
            X[i] = sc.nextInt();
        }
        int max=Integer.MAX_VALUE;
        int tmp=0;
        for(int zahyo=1; zahyo<=100; zahyo++){
            tmp=0;
            for(int i=0; i<N; i++){
                tmp+=(zahyo-X[i])*(zahyo-X[i]);
            }
            max=Math.min(max,tmp);
        }
        pl(max);
    }
    public static void pl(Object o){
        System.out.println(o);
    }
    public static void p(Object o){
        System.out.println(o);
    }
}
