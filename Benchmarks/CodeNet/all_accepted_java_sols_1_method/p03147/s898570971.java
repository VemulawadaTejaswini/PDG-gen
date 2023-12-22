import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int [] f = new int [n];
    
    int ans=0;
    
    for(int i=0; i<n; i++){
      f[i]=sc.nextInt();
     }
     
     boolean flag = false;
     int count =0;
     int d=0;
      
     while(count<n){
       if(d==n){
          d=0;
          if(flag==true)ans++;
          flag=false;
          }
       if(f[d]!=0){
         count=0;
         flag = true;
         f[d]--;
         }else{
           if(flag==true)ans++;
           flag=false;
           count++;
          }
        d++;
          
              //System.out.println(f[0]+" "+f[1]+" "+f[2]+" "+f[3]+" "+f[4]+" ans "+ans);
          
       }
       
      System.out.println(ans);

  }
  
}