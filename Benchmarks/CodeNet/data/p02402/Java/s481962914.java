import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long cnt = sc.nextLong();
        long min = 0;
        long max = 0;
        long total = 0;
        for(long i=0;i<cnt;i++){
            long num = sc.nextLong();
            if(i==0){
                min = num;
                max = num;
            } else if(num > max){
                max = num;
            } else if(num < min){
                min = num;
            }
            total += num;
        }
        System.out.printf("%s %s %s%n",min,max,total);
    }
}
