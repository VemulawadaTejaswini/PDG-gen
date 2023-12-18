import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n+1];
    int b[] = new int[n];
    for(int i=0;i<n+1;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++){
      b[i]=sc.nextInt();
    }
    long answer =0;
    
    for(int i=0;i<n;i++){
      answer=answer+Math.min(a[i],b[i]);
      b[i]=Math.max(b[i]-a[i],0);
      if(b[i]>0){
        answer=answer+Math.min(a[i+1],b[i]);
        a[i+1]=Math.max(a[i+1]-b[i],0);
      }
      
      
      
    }
    System.out.println(answer);
    
    
    
  }
  

  
}