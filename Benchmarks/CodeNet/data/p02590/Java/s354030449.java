import java.util.*;
import java.io.*;
 
public class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int P = 200003;
    int n = scan.nextInt();
    int[] array = new int[n];
    for(int i = 0; i < n; i++){
      array[i] = Integer.parseInt(scan.next()) % P;
    }
 
    long sum = 0;
 
    for(int i = 0; i < n; i++){
      for(int j = i; j < n; j++){
        int temp = array[i] * array[j];
        sum += temp % P;
      }
    }
 
    System.out.println(sum);
  }
}