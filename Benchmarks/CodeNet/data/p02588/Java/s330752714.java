import java.util.*;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    double a[];
    for(int i = 0;i < n;i++){
      a[i] = sc.nextDouble();
    }
    
    int count = 0;
    for(int j=0;j<n;j++){
     for(int k=0;k<n;k++){
       double A = a[j]*a[k];
       bigDecimal b = new bigDecimal(String.valueOf(A));
       int intValue = bigDecimal.intValue();
       if(b.subtract(new bigDecimal(intValue)).toPlainString() == 0.0){
         count++;
       }
     }
    }
    System.out.println(count);
  }
}