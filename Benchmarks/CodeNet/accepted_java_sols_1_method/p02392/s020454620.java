import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[] arr;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        
        if(arr[0] < arr[1] && arr[1] < arr[2]) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
