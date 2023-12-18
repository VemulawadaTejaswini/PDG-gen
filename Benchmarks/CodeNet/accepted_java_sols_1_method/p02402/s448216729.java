import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int count = sc.nextInt();
        long Max = -1000000;
        long Min = 1000000;
        long sum = 0;
        for(int i=0;i<count;i++){
            int num = sc.nextInt();
            Max = Math.max (Max, num);
            Min = Math.min (Min, num);
            sum+=num;
        }
       System.out.println(Min + " " + Max + " " + sum);
    }
}
