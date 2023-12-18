import java.util.*;
import java.io.*;
 
public class Main{
  
  static public void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    
    int[] D = new int[K];
    for(int i=0; i<K; i++){
      D[i] = sc.nextInt();
    }
    
    int price = N;
    String priceStr;
    int flag;
    
    while(true){
      flag = 0;
      priceStr = String.valueOf(price);
      
      for(int j=0; j<K; j++){
        if(priceStr.contains(String.valueOf(D[j]))){
          flag++;
        }else{
          
        }
      }
      if(flag == 0){
        break;
      }else{
        price++;
      }
    }
    
    System.out.println(price);
    
  }
}