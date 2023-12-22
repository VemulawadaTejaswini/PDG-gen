import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=br.readLine();
        String[] split=line.split(" ",0);
        int tate=Integer.parseInt(split[0]);
        int yoko=Integer.parseInt(split[1]);
        System.out.println((tate*yoko)+" "+(tate*2+yoko*2));
    }
}