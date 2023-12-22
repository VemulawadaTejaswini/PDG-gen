import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int[] a;
        a = new int[3];
        try{
        line = reader.readLine();
        String[] x = line.split(" ");
        a[0] = Integer.parseInt(x[0]);
        a[1] = Integer.parseInt(x[1]);
        a[2] = Integer.parseInt(x[2]);

        Arrays.sort(a);

        System.out.println(a[0]+" "+a[1]+" "+a[2]);

        }catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    
    }
}

