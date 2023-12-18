import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Double[] list = Arrays.stream(sc.nextLine().split(" ")).map(Double::parseDouble).toArray(Double[]::new);
            System.out.println((float)((list[2]-list[0])*(list[6]-list[4]))+(float)((list[3]-list[1])*(list[7]-list[5]))==0.0?"YES":"NO");
        }
    }
}

