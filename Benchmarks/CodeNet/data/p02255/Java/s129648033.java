import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // input data
        List<String> input = inputLines();
        
        // get input
        int length = Integer.valueOf(input.get(0));
        String[] numbersString = input.get(1).split(" ");
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = Integer.valueOf(numbersString[i]);
        }
        int[] A = numbers;

        // main logic
        for (int i = 1; i <= A.length-1; i++) {
            output(A);
            int key = A[i];
            /* insert A[i] into the sorted sequence A[0,...,j-1] */
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
        output(A);

    }

    private static List<String> mocups() {
        List<String> input = Arrays.asList(
                "6",
                "5 2 4 6 1 3"
                );
        return input;
    }

    /** output data */
    private static void output(int[] o) {
        System.out.println(Arrays.toString(o).replaceAll("[\\[,\\]]", ""));
    }

    /** input data */
    private static List<String> inputLines() {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input.add(buf);
        }
        in.close();
        return input;
    }

}