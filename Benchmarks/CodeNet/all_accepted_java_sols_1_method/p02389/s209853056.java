import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cut = input.split(" ");
        int surface = Integer.parseInt(cut[0]);
        int length = Integer.parseInt(cut[1]);
        System.out.println(surface * length + " " + 2 * ( surface + length ));
    }
}
