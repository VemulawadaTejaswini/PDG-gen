import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner("2");
        int r = scanner.nextInt();
//        System.out.printf("%1.6f %1.6f",method01(r), method02(r)); 
         }
    public static double method01(int r){
        double x = Math.PI;
        return (r * 2 * x);
        }
    public static double method02(int r){
        double x = Math.PI;
        return (r * r * x);
    }
}