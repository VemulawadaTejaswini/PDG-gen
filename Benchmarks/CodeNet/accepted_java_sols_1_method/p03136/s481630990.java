import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sideArrayTmp = br.readLine().split(" ");
        int[] sideArray = new int[n];
        for(int i = 0; i < n; i++){
            sideArray[i] = Integer.parseInt(sideArrayTmp[i]);
        }
        Arrays.sort(sideArray);
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += sideArray[i];
        }
        if(sum > sideArray[n-1]){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
