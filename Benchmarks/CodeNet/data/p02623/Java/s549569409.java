
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int sizeA = s.nextInt();
       int sizeB = s.nextInt();
       int limit = s.nextInt();
       
       int arrayA[] = new int[sizeA];
       int arrayB[] = new int[sizeB];

       for(int i = 0; i < sizeA; ++i) {
           arrayA[i] = s.nextInt();
       }
       
       for(int i = 0; i < sizeB; ++i) {
           arrayB[i] = s.nextInt();
       }
       int counter = 0;
       long sum = 0;
       int apointer = 0, bpointer = 0;
       
       while(apointer < sizeA || bpointer < sizeB) {
            if(apointer < sizeA && bpointer < sizeB) {
               if(arrayA[apointer] <= arrayB[bpointer]) {
                   if((long)sum + arrayA[apointer] > limit)
                       break;
                   sum +=(long)arrayA[apointer];
                   apointer++;
                   counter++;
               } else {
                   if((long)sum + arrayB[bpointer] > limit)
                       break;
                    sum +=(long)arrayB[bpointer];
                    bpointer++;
                    counter++;
               }
           }
           else if(apointer < sizeA) {
                if((long)sum + arrayA[apointer] > limit)
                       break;
                sum += (long)arrayA[apointer];
                apointer++;
                counter++;
           }
           else {
                if((long)sum+arrayB[bpointer] > limit)
                    break;
                sum +=(long)arrayB[bpointer];
                bpointer++;
                counter++;
           }
//            System.out.println(apointer+" "+bpointer);
       }
       System.out.println(counter);
   }
}
