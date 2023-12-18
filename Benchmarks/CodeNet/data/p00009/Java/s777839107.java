import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   /*maximum number of input*/
   public static final int MAX = 999999;
   
   public static void main(String[] args) {
      //create an array of prime numbers
      ArrayList<Integer> prime = createPrimeArr();
      Scanner sc = new Scanner(System.in);
      
      while(sc.hasNext()) {
         int input = Integer.parseInt(sc.nextLine());
         System.out.println(getIndex(prime, input) + 1);
      }
      
   }
   
   //creates an ArrayList holding all the prime numbers from 2 to MAX
   public static ArrayList<Integer> createPrimeArr() {
      ArrayList<Integer> prime = new ArrayList<>();
      //add 2 to the list
      prime.add(2);
      
      //the int "n" is the number to be checked if prime or not
      for(int n = 3; n <= MAX; n += 2) {
         int size = prime.size();
         //the int "i" is the index of divider in the array of prime
         for(int i = 0; i < size; i ++) {
            if(Math.pow(prime.get(i),2) > n) {
               prime.add(n);
               break;
            } else if(n % prime.get(i) == 0) {
               break;
            }
         }
      }
      return prime;
   }
   
   
   //wrapper method for getIndex
   public static int getIndex(ArrayList<Integer> list, int target) {
      return getIndex(0,list.size() - 1, list, target);
   }
   
   //use binary search to find the index of the closest element to the target in a list
   public static int getIndex(int start, int end, ArrayList<Integer> list, int target) {
      int middle = (start + end) / 2;
      if(start > end) {
         //if the target is not found, "end" indicates the target
         //for the binary search in this case
         return end;
      }else if(list.get(middle) == target) {
         return middle;
      } else if (target < list.get(middle)) {
         return getIndex(start, middle - 1, list, target);
      } else {// if(target > list.get(middle))
         return getIndex(middle + 1, end, list, target);
      }
   }
   
}
