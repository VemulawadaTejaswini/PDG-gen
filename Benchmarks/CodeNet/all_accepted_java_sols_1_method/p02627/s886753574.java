import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader alpha = 
         new BufferedReader(new InputStreamReader(System.in));
        
        String a = alpha.readLine();

        if(a == a.toUpperCase()){
            System.out.print("A");
        } else if(a == a.toLowerCase()){
            System.out.print("a");
        }
    }
}