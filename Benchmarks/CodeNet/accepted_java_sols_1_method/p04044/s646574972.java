import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        int givenLength = scanner.nextInt();
        scanner.nextLine();
        String[] array = new String[givenNumber];
        for(int i=0; i<givenNumber; i++) {
            array[i] = scanner.nextLine();
        }
        Arrays.sort(array);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<array.length; i++) {
            sb.append(array[i]);
        }
        System.out.println(sb);
    }
}
