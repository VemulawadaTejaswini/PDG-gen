import java.util.Scanner;
public class Main {
    public static int cStep(int[] arr){
        int steps = 0;
        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                int diff = arr[i]-arr[i+1];
                // update the array next value with this
                arr[i+1] += diff;
                steps +=diff;
            }
        }
        return steps;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfarr = scanner.nextInt();
        int[] arr = new int[lengthOfarr];

        for (int i = 0; i < lengthOfarr; i++) {
            int tempValue = scanner.nextInt();
            arr[i] = tempValue;
        }
        System.out.print(cStep(arr));
        scanner.close();
    }
}