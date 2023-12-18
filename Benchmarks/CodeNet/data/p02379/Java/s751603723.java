import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        BufferedReader  br = new  BufferedReader(new InputStreamReader(System.in));
        String[] inputCoodinate = br.readLine().split(" ");
        double x1 = Double.parseDouble(inputCoodinate[0]);
        double y1 = Double.parseDouble(inputCoodinate[1]);
        double x2 = Double.parseDouble(inputCoodinate[2]);
        double y2 = Double.parseDouble(inputCoodinate[3]);
        double xdistance = Math.pow(x2 - x1, 2);
        double ydistance = Math.pow(y2 - y1, 2);
        double ansdistance = Math.sqrt(xdistance+  ydistance);
        System.out.println(ansdistance);



    }

}
