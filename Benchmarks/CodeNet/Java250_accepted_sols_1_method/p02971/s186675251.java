import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int s[] = new int[n];
    
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      s[i]=a[i];
    }
    
    Arrays.sort(s);
    if(s[n-1]==s[n-2]){
     for(int i=0;i<n;i++){
       System.out.println(s[n-1]); 
     }
    }else{
     for(int i=0;i<n;i++){
       if(a[i]==s[n-1]){
         System.out.println(s[n-2]);
       }else{
         System.out.println(s[n-1]);
       }
     }
    }
    
    
    
    
  }
  

  
}