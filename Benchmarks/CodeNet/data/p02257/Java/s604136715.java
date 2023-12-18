import java.util.*;

public class Main {
    public static void main (String args[]) {
        // input

        int numEl;
        int numb;

        Scanner inp = new Scanner(System.in);

        numEl = inp.nextInt();

        int primeCounter = 0;

        for(int i = 0; i < numEl; i++) {
            numb = inp.nextInt();

            Boolean primeOrNot = isPrime(numb);

            if (primeOrNot == true) {
                primeCounter++;
            }
        }

        System.out.println(primeCounter);
    }

    public static boolean isPrime(int numb) {
        for(int i = 2; i < numb; i++) {
            if(numb%i == 0) {
                return false;
            }
        }

        return true;
    }
}

