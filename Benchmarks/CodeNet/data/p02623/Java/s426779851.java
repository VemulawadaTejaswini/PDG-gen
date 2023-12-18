import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[m];
        int indexA = 0, indexB = 0;
        int numberOfBooks = 0;
        for (int i = 0; i < n; i++)
            arrayA[i] = input.nextInt();
        for (int i = 0; i < m; i++)
            arrayB[i] = input.nextInt();
        while (k > 0 && (indexA < arrayA.length && arrayA[indexA] <= k || indexB < arrayB.length && arrayB[indexB] <= k)) {
            if (indexA < arrayA.length && indexB >= arrayB.length) {
                k -= arrayA[indexA];
                indexA++;
            }
            else if (indexB < arrayB.length && indexA >= arrayA.length) {
                k -= arrayB[indexB];
                indexB++;
            }
            else {
                if (arrayA[indexA] < arrayB[indexB]) {
                    k -= arrayA[indexA];
                    indexA++;
                }
                else {
                    k -= arrayB[indexB];
                    indexB++;
                }
            }
            numberOfBooks++;
        }
        System.out.println(numberOfBooks);
    }
}