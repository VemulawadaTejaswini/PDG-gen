import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.stream.IntStream;

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
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);
        try {
            while (true) {
                String input = bufferedReader.readLine();
                int N = Integer.parseInt(input.split(" ")[0]);

                int[] heights = new int[N];
                String[] arrayNumber = bufferedReader.readLine().split(" ");
                for (int i = 0; i < arrayNumber.length; i++) {
                    heights[i] = Integer.parseInt(arrayNumber[i]);
                }
                System.out.println(cStep(heights));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}