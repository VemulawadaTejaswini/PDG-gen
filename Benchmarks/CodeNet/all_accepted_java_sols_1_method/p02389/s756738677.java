import java.io.*;
 
public class Main {
     
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String[] arr = s.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            System.out.println(a * b + " " + (a + b) * 2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}