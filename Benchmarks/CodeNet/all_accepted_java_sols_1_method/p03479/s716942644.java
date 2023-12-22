import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int count = 0;
        while(a <= b){
            count++;
            a*=2;
        }

        System.out.println(count);
    }
}
