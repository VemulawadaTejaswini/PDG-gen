import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String s = in.next();

        System.out.println(a >= 3200 ? s : "red");
    }
}