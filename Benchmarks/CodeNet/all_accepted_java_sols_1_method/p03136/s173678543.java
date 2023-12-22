import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l[] = new int[n];
    int sum = 0;
    int k[] = new int[n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
      sum = sum+l[i];
    }
    for(int i=0;i<n;i++){
      k[i] = sum - l[i];
    }
    for(int i=0;i<n;i++){
      if(l[i]>=k[i]){
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
      
    
    
  }
  

  
}