import java.util.*;

public class Main{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong();
                        long sum = 0, i = 1;
                        while(sum < N) {
                                sum += i;
                                i++;
                        }
                        System.out.println(i-1);
                }
        }
}