import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String[] mem = readLineStandardInput().split(" ");
        int A = Integer.parseInt(mem[0]);
        int B = Integer.parseInt(mem[1]);
        int C = Integer.parseInt(mem[2]);
        int X = Integer.parseInt(mem[3]);
        int Y = Integer.parseInt(mem[4]);
        int remainX = X;
        int remainY = Y;
        int totalCost = 0;
        int sumAB = A + B;
        int minXY = X < Y ? X : Y;
        if(sumAB > 2 * C){
            totalCost += C * 2 * minXY;
            remainX -= minXY;
            remainY -= minXY;
        }
        if(remainX != 0){
            if(A > 2 * C){
                totalCost += 2 * C * remainX;
            }
            else{
                totalCost += A * remainX;
            }
        }
        if(remainY != 0) {
            if(B > 2 * C) {
                totalCost += 2 * C * remainY;
            }
            else {
                totalCost += B * remainY;
            }
        }
        System.out.println(totalCost);
    }

    private static String readLineStandardInput() {
        String str;
        try {
            str = input.readLine();
        } catch(IOException e){
            str = null;
            System.out.println(e);
        }
        return str;
    }
}
