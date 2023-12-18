import java.util.Scanner;

class Main{
   private static int n,min,max,ip;
 private static long sum;

    
  public static void main(String[] args){
    
    Scanner s= new Scanner(System.in);
   
  n=s.nextInt();
  ip=s.nextInt();
  for(int i=0;i<n;i++){
      
      ip=s.nextInt();
      
      min=ip;
      max=ip;
      sum=ip;
      
      if(min>ip){
          min=ip;
      }
      if(max<ip){
          max=ip;
      }
      sum+=ip;
      
  }
      System.out.printf(min+" "+max+" "+sum);
      
      
  }}
