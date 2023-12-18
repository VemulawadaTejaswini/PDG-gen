import java.util.Arrays;
import java.util.Scanner;

public class Main{

  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    long n,prod,check;
    long[] a = new long[];
	n = sc.nextInt();
    
    check = (long) Math.pow(10,18);
    prod = 1;
    
    for(int i=0;i<n;i++){
      if(prod>check){
      	System.out.println(-1);
        return;
      }
      a[i] = sc.nextLong();
      p = p*a[i];
    }
    
    System.out.println(p);
    
    
  }
  
}