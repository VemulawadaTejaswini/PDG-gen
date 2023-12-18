import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] arr = br.readLine().split("\\s");
            double x1 = Double.parseDouble(arr[0]), y1 = Double.parseDouble(arr[1]), x2 = Double.parseDouble(arr[2]), y2 = Double.parseDouble(arr[3]);
            double h = Math.abs(y1 - y2);
            double w = Math.abs(x1 - x2);
            System.out.println(String.valueOf(Math.sqrt(Math.pow(h,2)+Math.pow(w,2))));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

