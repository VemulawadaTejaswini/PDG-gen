import java.io.*;
import java.util.*;


public class Main {
    public static void main (String[]args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int ct = 0;
        int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = arr[0];i<arr[1]+1;i++){
            if(i%arr[2]==0){
                ct++;
            }
        }
            System.out.println(ct);
    }

}
