import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long W = sc.nextLong();
        long difa = 100000;
        long difb = 100000;

        for(int i=1; i<H; i++){
            long A = i * W;
            long B = (H - i) * (W / 2);
            long C = (H - i) * (W - W / 2);
            long max = Math.max(A, B);
            max = Math.max(max, C);
            long min = Math.min(A, B);
            min = Math.min(min, C);
            difa = Math.min(difa, max - min);

            B = (H - i) / 2 * W;
            C = (H - i - (H - i) / 2) * W;
            max = Math.max(A, B);
            max = Math.max(max, C);
            min = Math.min(A, B);
            min = Math.min(min ,C);
            difa = Math.min(difa, max - min);
        }

        for(int i=1; i<W; i++){
            long A = i * H;
            long B = (W - i) * (H / 2);
            long C = (W - i) * (H - H / 2);
            long max = Math.max(A, B);
            max = Math.max(max, C);
            long min = Math.min(A, B);
            min = Math.min(min, C);
            difb = Math.min(difb, max - min);

            B = (W - i) / 2 * H;
            C = (W - i - (W - i) / 2) * H;
            max = Math.max(A, B);
            max = Math.max(max, C);
            min = Math.min(A, B);
            min = Math.min(min ,C);
            difb = Math.min(difb, max - min);
        }

        System.out.println(Math.min(difa, difb));
    }
}