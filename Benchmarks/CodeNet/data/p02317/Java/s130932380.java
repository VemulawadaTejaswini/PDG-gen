import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] A = new int[n];
    int[] L = new int[n];

    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    sc.close();

    L[0] = A[0];
    int length = 1;

    for (int i = 1; i < n; i++) {
      if(L[length-1] < A[i]){
        L[length++] = A[i];
      }else{
        int index = ~Arrays.binarySearch(L, 0, length, A[i]);
        if (index < 0) index = ~index;
        L[index] = A[i];
      }
    }

    out.println(length);
	}
}
