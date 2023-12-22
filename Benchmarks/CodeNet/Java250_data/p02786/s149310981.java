import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long mainsum = clac(h, (long)0);
        System.out.println(mainsum);
    }
    public static long clac(long h,long ret){
        long sum = ret;
        if(h == 1){
            sum ++;
        }else{
            sum = clac(h/2,sum) * 2 + 1;
        }
        return sum;
    }
}