import java.io.*;
 
class Main {
    public static void main(String[] args ) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
        int x = Integer.parseInt(input.readLine());
        int y = (int)Math.pow(x,3);
        System.out.println(y);
    }
}