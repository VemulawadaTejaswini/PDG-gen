import java.util.*;

public class Main {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        Integer[] p = new Integer[A];
        Integer[] q = new Integer[B];
        Integer[] r = new Integer[C];
        for(int i = 0;i<A;i++){
            p[i] = sc.nextInt();
        }

        for(int i =0;i<B;i++){
            q[i] = sc.nextInt();
        }

        for(int i=0;i<C;i++){
            r[i] = sc.nextInt();
        }
        Arrays.sort(p,Collections.reverseOrder());
        Arrays.sort(q,Collections.reverseOrder());
        Arrays.sort(r,Collections.reverseOrder());

        long[] ABmaxans = new long[X+Y+1];
        int xcounter = 0;
        int ycounter = 0;

        for(int i = 1;i<X+Y+1;i++){
            if(xcounter > X -1){
                ABmaxans[i] = ABmaxans[i-1] + q[ycounter];
                ycounter++;
            } else if(ycounter > Y -1) {
                ABmaxans[i] = ABmaxans[i-1] + p[xcounter];
                xcounter++;
            } else if(p[xcounter] > q[ycounter]){
                ABmaxans[i] = ABmaxans[i-1] + p[xcounter];
                xcounter++;
            } else {
                ABmaxans[i] = ABmaxans[i-1] + q[ycounter];
                ycounter++;
            }
        }

        long Csum = 0;
        long ans = 0;
        for(int i = 0;i<X+Y;i++){

            ans = Math.max(ans,ABmaxans[X+Y-i]+Csum);

            if(i < r.length){
                Csum += r[i];
            }

        }

        System.out.println(ans);






    }

}







