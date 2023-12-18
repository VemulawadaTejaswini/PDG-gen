import java.util.*;
class Main{
 public static void main(String[]  args) throws IOException{
  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  int n = Integer.parseInt(bf.readLine());
   
   int a[] = new int[n];
   StringTokenizer st;
   st = new StringTokenizer(bf.readLine());
   for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
   }
   int k = Integer.parseInt(bf.readLine());
   
   
   while(k-->0){
     st = new StringTokenizer(bf.readLine());
     int sum=0;
     int x1 = Integer.parseInt(st.nextToken());
     int x2 = Integer.parseInt(st.nextToken());
     for(int i=0;i<n;i++){
       if(a[i]==x1)
          a[i]=x2;
          
          sum+=a[i];
     }
          System.out.println(sum);
   }
  
   
 }
  
  
  
}