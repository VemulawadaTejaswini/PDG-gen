import java.io.*;

public class Main {
    public static void main(String[] args){
        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
            String[] input = r.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(String.format("%d %d", a * b, 2 * (a + b)));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

