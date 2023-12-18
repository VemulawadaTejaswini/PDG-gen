import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long h = sc.nextLong();

        long cnt = 0;

        long binary = 1;

        while (h>0){
            cnt += binary;
            binary *= 2;
            h /= 2;
        }

        System.out.println(cnt);

    }
}




