
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            in.nextLine();
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i] = in.nextInt();
            }
            Arrays.sort(num);                                        //排序
            if(n==0 || n==1)
                System.out.println(0);
            if(n == 2)
                System.out.println(num[1]-num[0]);
            boolean b  = false;
            if(n>2) b  = true;
            int start = 1;
            int end = n-2;
            int max = num[n-1];
            int min = num[0];
            long abs = num[n-1]-num[0];
            while(start <= end){
                if(start == end){                              //最后剩下1个元素的情况
                    abs += Math.max(Math.abs(num[start]-min),Math.abs(num[start]-max));
                    break;
                }
                int maxt = num[end];
                int mint = num[start];
                abs += Math.abs(min-maxt);
                abs += Math.abs(max-mint);
                min = mint;
                max = maxt;
                start++;
                end--;
            }
            if(b)
            System.out.println(abs);
        }
    }
}
