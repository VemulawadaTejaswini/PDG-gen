import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        try{
          BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
          String s = r.readLine();
          int a = Integer.parseInt(s);

          BufferedReader r2 = new BufferedReader(new InputStreamReader(System.in), 1);
          String s2 = r2.readLine();
          int b = Integer.parseInt(s2);
        
          System.out.print(a*b);
          System.out.println(" " + (2*a+2*b));
        }
        catch{
          System.out.println("Error");
        }
    }
}