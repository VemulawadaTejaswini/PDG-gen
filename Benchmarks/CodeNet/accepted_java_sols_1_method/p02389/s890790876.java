import java.io.*;
 
class Main {
    public static void main(String[] arg)throws IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String s = b.readLine();
        String[] spl = s.split(" ");
        int tate =  Integer.parseInt(spl[0]);
        int yoko =  Integer.parseInt(spl[1]);
        System.out.println(tate*yoko + " "+ 2*(tate+yoko));
    }   
}