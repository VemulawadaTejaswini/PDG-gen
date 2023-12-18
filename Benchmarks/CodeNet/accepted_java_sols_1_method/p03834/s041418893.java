import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());
        String s = br.readLine();
        String[] sarr = s.split(",");
        System.out.println(sarr[0]+" "+sarr[1]+" "+sarr[2]);
    }

}
