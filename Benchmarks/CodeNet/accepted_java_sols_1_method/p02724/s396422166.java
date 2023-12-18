import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long temp = x/500;
        long flag = x - 500*temp;
        long temp1 = flag/5;
        System.out.println(temp*1000 + temp1*5);
        }
    }

