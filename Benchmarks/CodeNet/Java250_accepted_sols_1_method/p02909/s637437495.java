import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String[] arr = {"Sunny", "Cloudy", "Rainy"};
        for(int i=0; i<arr.length; i++) {
            if(s.equals(arr[i])) {
                int printIdx = i+1;
                if(printIdx == 3) {
                    printIdx = 0;
                }
                System.out.println(arr[printIdx]);
                return;
            }
        }
    }
}