input java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader tate=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader yoko=new BufferedReader(new InputStreamReader(System.in));
        try{
            int a=Integer.parseInt(tate);
            int b=Integer.parseInt(yoko);
        
            System.out.println(a*b+" "+a*2+b*2); 
        }catch(NumberFormatException) {
            e.printStackTrace();
        }
    }
}