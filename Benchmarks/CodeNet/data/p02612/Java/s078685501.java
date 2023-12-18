//package project1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main {
      public static void main(String args[]) {
    	  Scanner sc = new Scanner(System.in);
    			  int n = sc.nextInt();
    	  int res = (1000-(n%1000))%1000;
    	  System.out.println(res);
      }
}
