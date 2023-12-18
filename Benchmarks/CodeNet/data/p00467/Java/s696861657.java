import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        while(true){
            if(!run())
                break;
        }
    }
    public static boolean run(){
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        if(N==0&&M==0){
            return false;
        }
        int[] masu = new int[N];
        int[] sai = new int[M];
        int ans = 0;
        int basho=0;
        for(int i=0;i<N;i++){
            masu[i]=Integer.parseInt(sc.next());
        }
        for(int i=0;i<M;i++){
            sai[i]=Integer.parseInt(sc.next());
        }
        int i=0;
        while(true){
            if(basho>=N-1){
                break;
            }
            ans++;
            basho+=sai[i];
            i++;
            if(basho>=N-1){
                break;
            }
            basho+=masu[basho];
        }
        System.out.println(ans);
        return true;
    }
}