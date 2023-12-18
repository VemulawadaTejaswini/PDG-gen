import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Rectangle rect = new Rectangle(arr[0], arr[1]);
            System.out.printf("%d %d%n", rect.getSurface(), rect.getLap());
        }

    }

}

class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getSurface() {
        return a * b;
    }

    public int getLap() {
        return (a + b) << 1;
    }
}
