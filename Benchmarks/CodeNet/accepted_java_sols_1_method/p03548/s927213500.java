
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        long X = Input.nextLong();
        long Y = Input.nextLong();
        long Z = Input.nextLong();
        int Count = 0;

        if (X - Z > 0) {
            X = X - Z;
        } else {
            System.out.println("0");
        }

        while (X >= Z + Y) {
            Count++;
            X = X - (Z + Y);
            //System.out.println("C");
        }
        System.out.println(Count);

    }
}
