import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final long x  = scanner.nextLong();

        long div11 = x / 11;
        long res11 = x % 11;
        if(res11 == 0){
            System.out.println(div11*2);
        }
        else if(res11 <= 6){
            System.out.println(div11*2+1);
        }else{
            System.out.println(div11*2+2);
        }

    }
}