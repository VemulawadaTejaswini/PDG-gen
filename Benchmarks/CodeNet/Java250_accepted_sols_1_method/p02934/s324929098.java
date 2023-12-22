import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        double[] inputList = new double[first];
        double[] outputList = new double[first];
        
        for (int i = 0; i < first; i++) {
            inputList[i] = scan.nextInt();
        }
        
        double result = 0;
        for (int j = 0; j < first; j++) {
            result += 1 / inputList[j];
        }   
        System.out.println(1 / result);
    }
 }