import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
 	public static void main(String[] args) {
     	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int val = a + (a*a) + (a*a*a);
      	System.out.println(val);
    }
}