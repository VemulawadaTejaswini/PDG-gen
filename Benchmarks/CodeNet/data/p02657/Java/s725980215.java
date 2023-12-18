
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in[] = br.readLine().trim().split(" ");
        long a = Long.parseLong(in[0]);
        long b = Long.parseLong(in[1]);
        long mult = a*b;
        System.out.println(mult);

        br.close();

    }
}