import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.nextInt();
        }
        if (array[4] - array[0] <= array[5])
            System.out.println("Yay!");
        else {
            System.out.println(":(");
        }
    }
}