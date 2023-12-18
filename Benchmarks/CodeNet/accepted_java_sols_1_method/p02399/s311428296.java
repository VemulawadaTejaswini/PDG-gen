import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String[] ary = line.split(" ");
        int a = Integer.parseInt(ary[0]);
        int b = Integer.parseInt(ary[1]);
        
        int ansA = a / b;
        int ansB = a % b;
        double ansC = (double)a / (double)b;
        
        
        System.out.print(ansA + " " + ansB + " ");
        System.out.printf("%.5f", ansC);
        System.out.println("");
    }
}