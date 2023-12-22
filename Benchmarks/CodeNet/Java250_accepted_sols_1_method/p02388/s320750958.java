import java.io.*;

class Main {
    public static void main (String[ ] args) throws IOException {
         
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String str = input.readLine( );
    	int num = Integer.parseInt(str);
         
        System.out.println(num*num*num);
    }
}