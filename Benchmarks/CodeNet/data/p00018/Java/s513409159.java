
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        int[] dataAry = new int[5];
        Scanner sc = new Scanner(System.in);
        while ( i < 5 ) {
            dataAry[i] = sc.nextInt();
            i++;
        }
        Arrays.sort(dataAry);

        for ( i = 0; i < 3; i++ ) {
            int temp = dataAry[i];
            dataAry[i] = dataAry[4 - i];
            dataAry[4 - i] = temp;
        }

        i = 0;
        while ( i < 4 ) {
            System.out.print(dataAry[i] + " ");
            i++;
        }

        System.out.println(dataAry[4]);
    }
}