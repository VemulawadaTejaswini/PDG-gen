import java.util.*;

public class Main {
    static int primeCounter = 0;

    public static void main (String args[]) {
        // input

        int numEl;
        int numb;

        Scanner inp = new Scanner(System.in);

        numEl = inp.nextInt();

        int[] numbs = new int[numEl];

        for (int i = 0; i < numEl; i++) {
            numbs[i] = inp.nextInt();
        }

        for (int j : numbs) {
            Boolean primeOrNot = isPrime(j);

            if (primeOrNot == true) {
                primeCounter++;
            }
        }

        System.out.println(primeCounter);
    }

    public static boolean isPrime(int numb) {
        for(int i = 2; i <= numb/2; i++) {
            if(numb%i == 0) {
                return false;
            }
        }

        return true;
    }
}

