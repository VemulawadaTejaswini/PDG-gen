

import java.util.*;
public class Main {
    
public static void main (String[]args){
  Scanner input = new Scanner (System.in);
  int n = input.nextInt();
  int l = input.nextInt();
  String [] arr = new String [n];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=input.next();
    }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
    }
    System.out.println();

}
}