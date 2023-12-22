import java.io.*;

public class Main {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String str1= br.readLine();
            Double r= Double.parseDouble(str1);
            double S,C;
            S=r*r*Math.PI;
            C=2*r*Math.PI;
            System.out.printf("%f"+" "+"%f", S,C);
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("The input age was not correct.");
       }
    }
}
