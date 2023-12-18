import java.util.*;
class Main{
 public static void main(String[]  args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
   
   int a[] = new int[n];
   for(int i=0;i<n;i++){
    a[i]=sc.nextInt(); 
   }
   int k = sc.nextInt();
   
   
   while(k-->0){
     int sum=0;
     int x1 = sc.nextInt();
     int x2 = sc.nextInt();
     for(int i=0;i<n;i++){
       if(a[i]==x1)
          a[i]=x2;
          
          sum+=a[i];
     }
          System.out.println(sum);
   }
  
   
 }
  
  
  
}