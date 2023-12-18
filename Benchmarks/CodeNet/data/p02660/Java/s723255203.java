import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        List<Integer> primeNumbers = new ArrayList<>();

        int devideNum = 2;
        while(N % devideNum == 0) {
            primeNumbers.add(devideNum);
            N /= 2;
        }

        devideNum++;
        while (devideNum*devideNum <= N) {
            if (N % devideNum == 0) {
                primeNumbers.add(devideNum);
                N /= devideNum;
            } else {
                devideNum +=2;
            }
        }

        if(N != 1) {
            primeNumbers.add((int)N);
        }

        //Debug
        for(int num: primeNumbers) {
            System.err.println(num);
        }

        int e = 1;
        int result = 0;
        int last = 0;

        main: for(int i=0; i<primeNumbers.size(); i++) {
            System.err.println("i:" + i);
            int current = primeNumbers.get(i);
            System.err.println("current:" + current + " last:" + last);

            if(current == last) {
                e++;
            }else {
                e = 1;
            }
            System.err.println("e:" + e);
            last = current;

            for(int j=2; j<=e; j++) {
                if(i+j-1 >= primeNumbers.size()) {
                    continue main;
                }
                if(primeNumbers.get(i+j-1) != current) {
                    continue main;
                }
            }
            result++;
            System.err.println("add");
            i = i+e-1;
        }

        System.out.println(result);

    }
}