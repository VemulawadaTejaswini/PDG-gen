import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        double weight;
        while((buf = br.readLine())!=null){
            weight = Double.parseDouble(buf);
            System.out.println(
                    weight <= 48.0 ? "light fly" : weight <= 51.0? "fly"
                    : weight <= 54.0 ?"bantam" :weight <=57.00?"feather"
                    : weight <= 60.0 ?"light" : weight <=64.00?"light welter"
                    : weight <= 69.0 ?"welter": weight <=75.00?"light middle"
                    : weight <= 81.0 ?"middle": weight <=91.00?"light heavy" : "heavy");
        }
    }
}