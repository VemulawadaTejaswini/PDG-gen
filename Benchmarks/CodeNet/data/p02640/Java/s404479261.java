import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //inputStream
        try (var br = new BufferedReader(new InputStreamReader(System.in))) {
            var s = br.readLine().split(" ");
            int[] a = Stream.of(s).mapToInt(Integer::parseInt).toArray();

            if((2 * a[0] <= a[1] && a[1] <= 4 * a[0]) && a[1] % 2 == 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}