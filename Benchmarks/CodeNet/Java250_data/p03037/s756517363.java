import javax.management.monitor.CounterMonitor;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        //Euclid e1=new Euclid();//ユークリッドの互除法
        //Compute c1=new Compute();//累積和，
        //変数
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int answer=0;
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M =sc.nextInt();
        int L[]=new int[M];
        int R[]=new int[M];
        for(int i=0;i<M;i++)
        {
            L[i]=sc.nextInt();
            R[i]=sc.nextInt();
            if(i==0)
            {
                min=L[i];
                max=R[i];
            }else if(L[i]>min)
            {
                min=L[i];
            }
            if(R[i]<max)
            {
                max=R[i];
            }
        }
        //System.err.println("min"+min);
        //System.err.println("max"+max);
        answer=max-min+1;
        if(answer<0)
        {
            answer=0;
        }



        //出力
        //System.err.println();//標準エラー出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        System.out.println(answer);
    }
}