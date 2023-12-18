import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String[] inputs = input();
//        String[] inputs = mockup();

        String[] inputs4S = inputs.clone();

        int swapCount = bubbleSort(inputs);
        output(inputs);
        System.out.println("stable");

        int swapCount4S = selectionSort(inputs4S);
        output(inputs4S);
        System.out.println("Not stable");
    }

    /** bubble sort
     *
     * @param inputs
     * @return
     */
    private static int bubbleSort(String inputs[]) {
        int swapCount = 0;
        for (int i = 0; i < inputs.length; i++) {
            for (int j = inputs.length - 1; j > i; j--) {
                if (compare(inputs[j], inputs[j-1])) {
                    swap(inputs, j, j-1);
                    swapCount++;
                }
            }
        }
        return swapCount;
    }

    /**
     * selection sort
     * @param inputs
     * @return
     */
    private static int selectionSort(String[] inputs) {
        int swapCount = 0;
        int min = 0;

        for (int i = 0; i < inputs.length; i++) {
            min = i;
            for (int j = i; j < inputs.length; j++) {
                if (compare(inputs[j], inputs[min])) {
                    min = j;
                }
            }
            if (i != min) {
                swap(inputs, i, min);
                swapCount++;
            }
        }
        return swapCount;
    }

    private static String[] mockup() {
        String a[] = {"H4","C9","S4","D2","C3"};
        return a;
    }

    private static void swap(String[] inputs, int j, int i) {
        String a = inputs[j];
        String b = inputs[i];
        inputs[i] = a;
        inputs[j] = b;
    }
    private static boolean compare(String a, String b) {
        int iA = Integer.valueOf(a.substring(1));
        int iB = Integer.valueOf(b.substring(1));
        return iA < iB;
    }

    public static void output(String[] inputs) {
        // output
        StringBuilder output = new StringBuilder();
        for (String i : inputs) {
            output.append(i + " ");
        }
        String outputString = output.toString();
        System.out.println(outputString.substring(0,outputString.length() - 1));
    }

    public static String[] input() {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] inputs = new String[count];
        for (int i = 0; i < count; i++) {
            inputs[i] = in.next();
        }
        in.close();
        return inputs;
    }

}