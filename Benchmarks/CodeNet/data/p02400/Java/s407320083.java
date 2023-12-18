import java.io.*;

public class Circle{
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int radius = Integer.parseInt(line);
            double area = radius * radius * Math.PI;
            double circle = 2 * radius * Math.PI;
            System.out.println(area );
            System.out.println(circle);
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
