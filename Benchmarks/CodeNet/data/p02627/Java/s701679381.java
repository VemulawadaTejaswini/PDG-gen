import java.io.*;

class alphabet
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader alpha = 
         new BufferedReader(new InputStreamReader(System.in));
        
        String a = alpha.readLine();

        if(a == a.toUpperCase()){
            System.out.print("A");
        } else{
            System.out.print("a");
        }
    }
}