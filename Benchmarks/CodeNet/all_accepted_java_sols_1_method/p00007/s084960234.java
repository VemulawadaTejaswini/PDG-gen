import java.io.*;
   
class Main{
    public static void main(String[] args) throws Exception{
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(br.readLine());
        double y = 100000;
        long    z = 0;
        for (long i=0; i<x; i++) {
            y = y + (y * 0.05);
            y = y /1000;
            y = Math.ceil(y);
            y = y * 1000;
            z = (long)y;
        }
        System.out.println(z);
    }
}