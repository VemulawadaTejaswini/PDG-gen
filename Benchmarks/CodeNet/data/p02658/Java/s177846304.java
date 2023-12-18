import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        long multiple=1;
        long max = (long) Math.pow(10,18);
        long size = sc.nextLong();
        for(long i=0;i<size;i++) {
            long num = sc.nextLong();
            multiple *= num;
        }
        if(multiple > max){
            System.out.println(-1);
        }else {
            System.out.println((int) multiple);
        }
    }
}
