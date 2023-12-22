import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] list = new int[N];
    for(int i = 0; i < N ; i++){
      list[i] = sc.nextInt();
    }
    
    int count = 0;
    int Max = 0;
    for(int i = 1; i < N ; i++){
     if(list[i-1] >= list[i]){
       count++;
       if(Max < count){
         Max = count;
       } 
     }else{
       if(Max < count){
         Max = count;
       }  
       count = 0;
     }
    }
   
     System.out.println(Max);  
   
  }
}