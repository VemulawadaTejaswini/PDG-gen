import java.io.*;
import java.util.*;

public class Main {
 	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
      	PrintWriter out = new PrintWriter(System.out);
      	int[] arr = new int[sc.nextInt()];
      	int wrong = 0;
      	for (int i = 0; i < arr.length; i++) {
         	arr[i] = sc.nextInt(); 
          	if (arr[i] != i + 1) {
             	wrong++; 
            }
        }
      	out.println(wrong == 2 || wrong == 0 ? "YES" : "NO");
      	out.close();
   }
}