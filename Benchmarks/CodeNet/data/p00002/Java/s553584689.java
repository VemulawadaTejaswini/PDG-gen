import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        String input = "";
         
        while((input = br.readLine()) != null){
            String[] arr = input.split(" ");
     
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
     
            int inputAngka = a + b;
     
            System.out.println(count(inputAngka));
        }
 
    }
 
    public static int count(int a) {
        if (a < 10) {
            return 1;
        } else {
            return 1 + count(a / 10);
        }
    }
 
}