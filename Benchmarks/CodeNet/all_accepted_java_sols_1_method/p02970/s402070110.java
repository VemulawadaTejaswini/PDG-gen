import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double d=sc.nextInt();
        int x=(int)Math.ceil(n/(2d*d+1d));
        System.out.println(x);

    }

}

