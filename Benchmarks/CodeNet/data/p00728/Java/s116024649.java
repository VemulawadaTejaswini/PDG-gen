import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i;
    int[] array = new int[n];

    for(i=0; i<n; i++){
      array[i] = sc.nextInt();
    }
    Arrays.sort(array);
    array[0] = 0;
    array[array.length-1] = 0;

    int ave=0;
    for(i=0; i<n; i++){
      ave += array[i]/(n-2);
    }

    System.out.println(ave);
  }
}
