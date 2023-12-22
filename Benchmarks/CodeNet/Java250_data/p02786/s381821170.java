import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long t = 1;
        long ret = t;
        for(int i=0;Math.pow(2,i+1)<=h;i++){
          t *= 2;
          ret += t;
        }

        System.out.println(ret);
    }
}