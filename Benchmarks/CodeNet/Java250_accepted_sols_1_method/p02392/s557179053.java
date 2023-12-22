import java.io.*;
class Main{
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
         
        String line = r.readLine();    
        String[] w = line.split(" ",0); 
        int a=Integer.parseInt(w[0]);
        int b=Integer.parseInt(w[1]);
        int c=Integer.parseInt(w[2]);
        System.out.println(a<b&&b<c?"Yes":"No");
        r.close();
    }
}