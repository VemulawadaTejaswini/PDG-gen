import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer input = Integer.valueOf(sc.nextLine());
        Long output = 1L;
        for(int i=input; 1<input ; input--) {
            output = input * output;
        }
        System.out.println(output);
    }
}