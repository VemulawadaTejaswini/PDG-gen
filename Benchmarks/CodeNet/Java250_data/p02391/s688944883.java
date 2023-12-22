import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
         
        String line = r.readLine();    
        String[] w = line.split(" ",0); 
        int a=Integer.parseInt(w[0]);
        int b=Integer.parseInt(w[1]);
        
        if((-1000 <= a) & (b <= 1000)){
            if (a == b) {
                System.out.println("a == b");
            } else if (a < b) { 
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }
        }
        r.close();
    }
}