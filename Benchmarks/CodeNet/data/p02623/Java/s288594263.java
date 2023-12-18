import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int sizeA = s.nextInt();
       int sizeB = s.nextInt();
       long limit = s.nextLong();
       
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
                   if(aboveLimit(sum + arrayA[apointer],limit))
                       break;
                   
                   sum +=arrayA[apointer];
                   apointer++;
                   counter++;
               } else {
                   if(aboveLimit(sum + arrayB[bpointer] , limit))
                       break;
                   
                    sum +=(long)arrayB[bpointer];
                    bpointer++;
                    counter++;
               }
           }
           else if(apointer < sizeA) {
                if(aboveLimit(sum + arrayA[apointer],limit))
                    break;
                sum +=arrayA[apointer];
                apointer++;
                counter++;
           }
           else {
                if(aboveLimit(sum+arrayB[bpointer],limit))
                    break;
                sum +=arrayB[bpointer];
                bpointer++;
                counter++;
           }
       }
       System.out.println(counter);
   }
   public static boolean aboveLimit(Long val, Long limit) {
       if(val <= limit)
           return false;
       return true;
   }
}
