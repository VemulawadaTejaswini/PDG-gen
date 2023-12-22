import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[givenNumber];
        for(int i=0; i<givenNumber; i++) {
            array[i] = scanner.nextInt();
        }
        boolean isDuplicated = false;
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<newArray.size(); j++) {
                if(array[i] == newArray.get(j)) {
                    isDuplicated = true;
                    break;
                }
            }
            if(!isDuplicated) {
                newArray.add(array[i]);
            }
            isDuplicated = false;;
        }
        System.out.println(newArray.size());
    }
}
