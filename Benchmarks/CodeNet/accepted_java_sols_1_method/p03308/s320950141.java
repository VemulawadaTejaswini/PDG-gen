import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0;i < a;++i){
            int b = scanner.nextInt();
            if(b < min)min = b;
            if(b > max)max = b;
        }
        System.out.println(max - min);
    }
}
