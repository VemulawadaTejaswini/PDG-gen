import java.util.*;
import java.lang.*;
import java.io.*;
class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int bill = 1000;
      if(N>=bill)
      {
        while(N>bill)
        {
            bill = bill + 1000; 
        }
        System.out.println(bill-N);
      }
      else
      	System.out.println(0);
    }
}