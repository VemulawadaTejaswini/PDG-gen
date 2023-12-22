import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int usage = scanner.nextInt();
        int[] array = new int[givenNumber];
        for(int i=0; i<givenNumber; i++) {
            array[i] = scanner.nextInt();
        }

        int output = 0;
        int loopCount = 0;
        Arrays.sort(array);
        while(loopCount < usage) {
            output += array[array.length-1-loopCount];
            loopCount++;
        }
        System.out.println(output);
    }
}
