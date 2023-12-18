import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] ws = sc.nextLine().split(" ");
            BigInteger a = new BigInteger(ws[0]);
            BigInteger b = new BigInteger(ws[1]);
            System.out.println(a.add(b).toString());
        }
    }
}