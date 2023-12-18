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

        int w = arr[0];
        int h = arr[1];
        int x = arr[2];
        int y = arr[3];
        int r = arr[4];


        boolean res;
        
        res  = x - r >= 0;
        res &= x + r <= w;
        res &= y - r >= 0;
        res &= y + r <= h;

        System.out.println(res?"Yes":"No");
    }

}

