import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int inputNum = scan.nextInt();
        int[] values = new int[inputNum];
        float math = (float)0.0;
        for(int i = 0; i < inputNum; i++){
            values[i] = scan.nextInt();
        }
        for(int i = 0; i < inputNum; i++){
            math += (float)1 / values[i];
        }
        System.out.println((float)1 / math);
        
        scan.close();
    }
  
}