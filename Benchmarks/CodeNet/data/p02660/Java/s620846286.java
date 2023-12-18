import java.text.DecimalFormat;
import java.util.stream.LongStream;
import java.util.stream.IntStream;
import java.io.*;
import java.util.*;
import java.util.List;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N;
        int index = 2;
        int count = 0;
        N = sc.nextLong();

        while (N != 1) {
            if (N % index == 0) {
                N /= index;
                count++;
            }
            index++;
        }
        System.out.println(count);
        sc.close();
    }
}