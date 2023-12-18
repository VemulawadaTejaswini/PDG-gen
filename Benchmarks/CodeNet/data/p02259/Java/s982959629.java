import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                System.in));

        int len = Integer.parseInt(reader.readLine());
        int[] arr = new int[len];

        String arrStr = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(arrStr, " ");

        int i = 0;
        while (tokenizer.hasMoreElements()) {
            arr[i++] = Integer.parseInt((String) tokenizer.nextElement());
        }

        // int[] arr = {5,4,3,2,7,8,9};
        // int len = arr.length;

        bubblesort(arr, len);
    }

    private static void bubblesort(int[] arr, int len) {

        int last = len - 1;
        int swapCnt = 0;

        for (int i = last; i >= 0; i--) {

            for (int j = (i - 1); j >= 0; j--) {

                int current = arr[i];
                int target = arr[j];

                if (target > current) {

                    swapCnt++;

                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }

            }

        }
        printArr(arr);
        System.out.println(swapCnt);
    }

    static void printArr(int[] arr) {
        String msg = "";
        for (int i = 0; i < arr.length; i++) {
            msg += arr[i];
            if (i == arr.length - 1) {
                break;
            }
            msg += " ";
        }

        System.out.println(msg);
    }

}