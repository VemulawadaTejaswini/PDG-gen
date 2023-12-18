import java.io.*;
import java.util.*;

class JudgingMchine {
    static boolean isPrime(int x) {
        if(x == 2) {
        return true;
    }
    if(x < 2 || x % 2 == 0) {
        return false;
    }

    int i =3;
    while(i <= Math.sqrt(x)) {
        if(x % i == 0) {
            return false;
        }
        i += 2;
    }
    return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    List<Integer> nums = new ArrayList<>();
    for(int i=0; i<n; ++i) {
        nums.add(sc.nextInt());
    }

    int count = 0;
    for(int num : nums) {
        if(JudgingMchine.isPrime(num)) {
            count++;
        }
    }

    System.out.println(count);

    }
}