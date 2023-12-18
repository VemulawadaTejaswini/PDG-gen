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
    
//    for i = 1 to length[A]
//     do for j = length[A] downto i+1
//            3         do if A[j] < A[j-1]
//            4             then A[j] ??即 A[j-1]??????????????????

    private static void bubblesort(int[] arr, int len) {

        
      
        int swapCnt = 0;

        for (int i = 0; i < len - 1; i++) {
            
            for (int j = (i + 1); j < len; j++) {

                int current = arr[i];
                int target = arr[j];

                if (target > current) {

                    swapCnt++;

                    int swap = current;
                    arr[i] = target;
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