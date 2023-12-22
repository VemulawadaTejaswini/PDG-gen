import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int size = s.nextInt();
       int k = s.nextInt();
       int elements[] = new int[size];
       for(int i=0;i<size;i++) {
           elements[i] = s.nextInt();
       }
       Arrays.sort(elements);
       long sum = 0;
       for(int i=0;i<k&&i<size;i++) {
           sum += elements[i];
       }
       System.out.println(sum);
   }
}
