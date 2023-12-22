import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = br.readLine();

        int a = s.indexOf("A");
        int z = s.lastIndexOf("Z");

        System.out.println(z-a+1);

    }


}
