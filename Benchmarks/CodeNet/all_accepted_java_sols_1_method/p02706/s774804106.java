import java.util.*;

 // Compiler version JDK 11.0.2

 class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    long n = sc.nextLong();
    int m = sc.nextInt();
    int a[]= new int[m];
    long sum =0;
    for(int i =0;i<m;i ++)
    {
      a[i]= sc.nextInt();
      sum= sum + a[i];
      
    }
    if(n>=sum)
    System.out.println(n-sum);
    else
    System.out.println("-1");
    
   }
 }
