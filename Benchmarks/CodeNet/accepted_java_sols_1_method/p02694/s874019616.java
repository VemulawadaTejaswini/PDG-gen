import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long count = 0;
        long current = 100l;
        while(true){
            if(current >= x){
                break;
            }
            long r = (long) (Double.valueOf(current) * 0.01d);
            current += r;
            count++;
        }
        System.out.println(count);

    }
}