import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int ind[] = new int[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }

    for(int i=0;i<n;i++){
      //i番目にjが来たら、j番目はi+1
      ind[a[i]-1]=i+1;
      
    }
    for(int i=0;i<n;i++){
      System.out.print(ind[i]);
      System.out.print(" ");
    }
        
    
      
    
    
  }
  

  
}