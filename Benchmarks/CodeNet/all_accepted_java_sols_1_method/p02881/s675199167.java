import java.util.*;
import java.lang.Math;
public class Main{
        public static void main(String[]args){
                Scanner scan = new Scanner(System.in);
                long n = scan.nextLong();
                long t = (long)Math.sqrt((double)n);
                Long x = 0L;
                for(long i = 1; i <= t; i++){
                        if(n % i == 0){
                                x = i;
                                }
                        }
                System.out.println(n / x + x - 2);
                }
        }
