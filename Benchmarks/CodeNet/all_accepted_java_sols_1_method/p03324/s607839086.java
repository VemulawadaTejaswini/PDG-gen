import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int n = sc.nextInt();
    int i;
    int total = 0;
    if(d==0){
      if(n==100){
        total = 101;
      }else{
        total = n;
      }
    }else if(d==1){
      if(n==100){
        total = 10100;      
      }else{
        for(i=0;i<n;i++){
          total += 100;
      }
      }
    }else if(d==2){
      if(n==100){
        total = 1010000;
      }else{
        for(i=0;i<n;i++){
          total += 10000;
      }
      }
    }
    System.out.println(total);
 }
}