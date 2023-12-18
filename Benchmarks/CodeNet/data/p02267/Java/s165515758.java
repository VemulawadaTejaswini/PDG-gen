import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = (scanner.nextInt());
        int [] S= new int[size];
        for (int i = 0; i < size; i++) {
            S[i] = scanner.nextInt();
        }

        int ansSize = (scanner.nextInt());
        int[] T = new int[ansSize];
        for (int i = 0; i < ansSize; i++) {
            T[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i <T.length ; i++) {
            for (int j = 0; j < S.length; j++) {
                if(T[i]==S[j]){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
