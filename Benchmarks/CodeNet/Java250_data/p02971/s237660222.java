import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    int[] h = new int[N];  
    int max = 0; 
    int idx = 0; 
    for (int i=0; i < N ;i++) {
      h[i] =  sc.nextInt();
      if(h[i]>max){
        max = h[i];
        idx = i;
      }
    }
    int max2 = 0; 
    // int idx2 = 0; 
    for (int i=0; i < N ;i++) {
      if(i !=idx){
      if(h[i]>max2){
        max2 = h[i];
      }
    }
    }
    for (int i=0; i < N ;i++) {
      if(i !=idx){
        System.out.println(max);
       }else{
      System.out.println(max2);
    }
  }
}
}

