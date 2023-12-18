import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        int needStrip = 0;
        int startOutlet =1;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(startOutlet<arr[1]) {
            startOutlet--;
            startOutlet+=arr[0];
            needStrip++;
        }
        System.out.println(needStrip);                                     
    }
}
