import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long count = 0;
        long i = 1;
        while(h>0){
            h /= 2;
            count += i;
            i *=2;
        }
        System.out.println(count);
    }
}