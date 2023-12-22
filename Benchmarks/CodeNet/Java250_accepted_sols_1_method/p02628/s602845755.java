import java.util.*;
class Main{
 public static void main(String[]  args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
   int k = sc.nextInt();
   int a[] = new int[n];
   for(int i=0;i<n;i++){
    a[i]=sc.nextInt(); 
   }
   Arrays.sort(a);
   int sum=0;
   int j=0;
   while(k-->0){
     sum+=a[j];
     j++;
   }
   System.out.println(sum);
   
   
 }
  
  
  
}