import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        long Max,Min,sum;
        int n = input.nextInt();
        Max = -1000000;
        Min = 1000000;
        sum = 0;
        for(int i=0;i<n;i++){
            int a = input.nextInt();
            Min = Math.min (Min, a);
            Max = Math.max (Max, a);
            sum+=a;
        }
       System.out.println(Min+" "+Max+" "+sum);
    }
}
