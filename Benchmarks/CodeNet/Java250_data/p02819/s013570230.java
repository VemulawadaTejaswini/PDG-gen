import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        boolean flag = false;

        while (flag == false){
            flag = isPrime(X);
            X++;
        }
        System.out.println(X-1);
    }

    public static boolean isPrime(int X) {
        if(X == 2) return true;
        if(X % 2 == 0) return false;

        double sqrtNum = Math.sqrt(X);

        for(int i=3; i<= sqrtNum; i += 2) {
            if(X % i == 0) return false;
        }
        return true;
    }
}