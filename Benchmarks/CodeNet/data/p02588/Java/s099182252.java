import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double a[] = new double();
    for(int i = 0;i < n;i++){
      a[i] = sc.nextDouble();
    }
    
    int count = 0;
    for(int j=0;j<n;j++){
     for(int k=0;k<n;k++){
       double A = a[j]*a[k];
       int B = a[j]*a[k];
       if(A - B = 0){
        count++;
       }
     }
    }
    System.out.println(count);
  }
}