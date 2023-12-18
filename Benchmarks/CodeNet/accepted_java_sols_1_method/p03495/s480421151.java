import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
 
    String[] inputHeader = scanner.nextLine().split(" ");
    
    int N = Integer.parseInt(inputHeader[0]);
    int K = Integer.parseInt(inputHeader[1]);
    
    String[] inputData = scanner.nextLine().split(" ");

    int[] array = new int[200000+1];
    
    for(int i =0;i <N;i++){
        array[Integer.parseInt(inputData[i])]++;
    }

    Arrays.sort(array);
    
    int result = 0;
    for(int i = 0;i < array.length-K;i++){
        result += array[i];
    }
    
    System.out.println(result);
    scanner.close();
  }
}