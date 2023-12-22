import java.util.*;
import java.io.*;
import java.lang.*;
 
public class Main {
 	public static void main (String[] args) {
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	while (n>=1000) {
         	n-=1000; 
        }
      	System.out.println(n==0 ? n : 1000-n);
    }
}
