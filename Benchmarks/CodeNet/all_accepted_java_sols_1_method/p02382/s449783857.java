import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    //??´??°n

        int[] x = new int[n];   //????????????x??¨?????????
        int[] y = new int[n];   //????????????y??¨?????????

//      x???????´????????????????????????????????´?
        String[] inputX = br.readLine().split(" ");
        for(int i = 0; i < inputX.length; i++){
            x[i] = Integer.parseInt(inputX[i]);
        }
//      y???????´????????????????????????????????´?
        String[] inputY = br.readLine().split(" ");
        for(int i = 0; i < inputX.length; i++){
            y[i] = Integer.parseInt(inputY[i]);
        }
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double infinity = 0;

        for(int i = 0; i < n; i++){
            p1 += Math.abs(x[i] - y[i]);
            p2 += Math.abs(Math.pow(x[i] - y[i], 2));
            p3 += Math.abs(Math.pow(x[i] - y[i], 3));
            if(infinity < Math.abs(x[i] - y[i])){
                infinity = Math.abs(x[i] - y[i]);
            }
        }
        System.out.println(p1);
        System.out.println(Math.sqrt(p2));
        System.out.println(Math.cbrt(p3));
        System.out.println(infinity);
    }
}