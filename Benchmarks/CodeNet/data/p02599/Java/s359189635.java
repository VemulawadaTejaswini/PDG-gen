     import java.util.*;
class Main{
public static void main(String[] args)  throws Exception {
Scanner sc=new Scanner(System.in);
  try{
   int n=sc.nextInt();
int q=sc.nextInt();
         int arr[]=new int[n+1];
 
         for(int i=0;i<n;i++){
           
         arr[i]=sc.nextInt();
         }

         for(int i=0;i<q;i++){
 int l=sc.nextInt()-1;
             int r=sc.nextInt()-1;
   HashSet<Integer> m=new HashSet<>();
           for(int j=l;j<=r;j++){
m.add(arr[j]);
           }
            System.out.println(m.size());
         }
  
}catch(Exception e){
    return;
  }
}
}
    
