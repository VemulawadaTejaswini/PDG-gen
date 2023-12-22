import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        boolean flag[] = new boolean[N];
        for(int i=0;i<N;i++) flag[i] = false;
        int K = sc.nextInt();
        int count = 0;
        for(int i=0;i<K;i++){
            int d = sc.nextInt();
            for(int j=0;j<d;j++)
              	flag[sc.nextInt()-1]=true;
        }
        for(int i=0;i<N;i++) if(!flag[i]) count++;
        System.out.println(count);
    }
}