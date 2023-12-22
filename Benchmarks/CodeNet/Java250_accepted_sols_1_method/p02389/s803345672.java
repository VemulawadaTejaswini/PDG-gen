import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
         
        String s = r.readLine();    
        String[] w = s.split(" ",0); 
        int tate=Integer.parseInt(w[0]);
        int yoko=Integer.parseInt(w[1]);
        
        
        System.out.println(tate*yoko+" "+2*(tate+yoko));
        
        r.close();
    }
}