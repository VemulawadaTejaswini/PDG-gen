import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  n = sc.nextInt();
     int k = sc.nextInt();
     int[] alpha = new int[N];
     for(int i=0;i<N;i++){
       alpha[i]= sc.nextInt();
     }
     sort(alpha);
     System.out.println(alpha[0]+alpha[1]+alpha[2]+alpha[3]);

   }
   private static void sort(int[] array) {//[10]
       int elementEndIndex = array.length - 1;//[11]
       for (int comparisonEndIndex = 0; comparisonEndIndex < elementEndIndex; comparisonEndIndex++) {//[12]
           swapIfGreaterThan(array, comparisonEndIndex, elementEndIndex);//[13]
       }
   }
   private static void swapIfGreaterThan(int[] array, int comparisonEndIndex, int elementEndIndex) {//[20]
       for (int comparisonIndex = elementEndIndex; comparisonIndex > comparisonEndIndex; comparisonIndex--) {//[21]
           if(array[comparisonIndex] < array[comparisonIndex - 1]) {//[22]
               swapElementOfArray(array, comparisonIndex);//[23]
           }
       }
   }
   private static void swapElementOfArray(int[] array, int index) {//[30]
       int temp = array[index];//[31]
       array[index] = array[index - 1];//[32]
       array[index - 1] = temp;//[33]
   }
}
