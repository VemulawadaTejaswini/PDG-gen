import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int[] inputs = input();
//        int[] inputs = mockup();

        int swapCount = sort(inputs);

        // output
        StringBuilder output = new StringBuilder();
        for (int i : inputs) {
            output.append(i + " ");
        }
        String outputString = output.toString();
        System.out.println(outputString.substring(0,outputString.length() - 1));
        System.out.println(swapCount);
    }

    /**
     * selection sort
     * @param inputs
     * @return
     */
    private static int sort(int[] inputs) {
        int swapCount = 0;
        int min = 0;

        for (int i = 0; i < inputs.length; i++) {
            min = i;
            for (int j = i; j < inputs.length; j++) {
                if (inputs[j] < inputs[min]) {
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

    private static int[] mockup() {
        int a[] = {5,6,4,2,1,3};
        return a;
    }

    private static void swap(int[] inputs, int j, int i) {
        int a = inputs[j];
        int b = inputs[i];
        inputs[i] = a;
        inputs[j] = b;
    }

    public static int[] input() {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] inputs = new int[count];
        for (int i = 0; i < count; i++) {
            inputs[i] = in.nextInt();
        }
        in.close();
        return inputs;
    }

}