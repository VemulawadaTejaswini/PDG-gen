import java.util.*;
import java.math.BigInteger;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int x = scan.nextInt();
      ArrayList<Integer> a = new ArrayList<>();
      for(int i = 0 ; i < n ; i++){
          a.add(scan.nextInt());
      }
      int sum = 0 ;
      Collections.sort(a,Collections.reverseOrder());
      for(int i = 0 ; i <x ; i++){
          sum+=a.get(i);
      }
      System.out.println(sum);
    }
}