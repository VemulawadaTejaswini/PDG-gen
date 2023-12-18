import java.util.*;
class Main{
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int[] array = new int[n];
  for(int i = 0; i < n; i++){
   array[i] = scan.nextInt();
  }
  Arrays.sort(array);
  System.out.print(array[n - 1]);
  for(int i = 2; i <= n; i++){
   System.out.print(" " + array[n - i]);
  }System.out.println();
 }
}