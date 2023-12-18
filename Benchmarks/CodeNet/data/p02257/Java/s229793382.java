import java.util.*;

public class Main {
    public static void main (String args[]) {
        // input

        int numEl;
        int numb;

        Scanner inp = new Scanner(System.in);

        numEl = inp.nextInt();

        int[] numbs = new int[numEl];

        for(int i = 0; i < numEl; i++) {
            numb = inp.nextInt();

            numbs[i] = numb;
        }


        int primeCounter = 0;

        for(int j = 0; j < numEl; j++) {
            Boolean primeOrNot = isPrime(numbs[j]);

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

