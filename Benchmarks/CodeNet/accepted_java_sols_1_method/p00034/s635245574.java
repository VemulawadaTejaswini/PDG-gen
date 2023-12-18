import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    	
        int[] x = new int[12];
        int[] y = new int[12];
        int tp;
        
        while(sc.hasNext()) {

            String[] s = sc.next().split(",");
            tp=0;
            
            for(int i=0; i<12; i++) {
            	x[i]= Integer.parseInt(s[i]);
            	y[i]=tp+x[i];
            	tp+=x[i];
            }
            
            double d, t, v;
			int ans=0;

            d=y[9];
            v=x[10]+x[11];
            t=d/v;
            
            d=t*x[10];
            for(int i=0; i<10 && d>y[i]; i++) ans =i+2;
            
//            System.out.println(t); スレ違いの時間
//           System.out.println(d);　　スレ違いの位置
            System.out.println(ans);
        }

    }
}