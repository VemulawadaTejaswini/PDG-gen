import java.util.*;

public class Main{
  
  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
    int num1 = num+num-1;
    int[] list = new int[num1];
    
    list[1] = sc.nextInt();
    int a = list[1];
    list[0] = a;
    
    if(sc.hasNext()){
     for(int i = 2; i < num1-1; i+=2){
        list[i+1] = sc.nextInt();
        int b = list[i+1];
        int c = list[i-1];
         if(b < c){
           list[i] = b;
         }else if(b == c){
           list[i] = b;
         }else{
           list[i] = c;
         }
     }
    }
    
    int d = list[num1-2];
      list[num1-1] = d;
    
 int ans = 0;
  
  for(int i = 0; i < list.length; i +=2){
    ans += list[i];
  }
  
  System.out.println(ans);
  
  }
}
