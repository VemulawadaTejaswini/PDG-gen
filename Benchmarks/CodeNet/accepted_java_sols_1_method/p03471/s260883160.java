import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int y = sc.nextInt();
    
    int a = 0, b = 0, c = 0;
    boolean flag = false;
        for(int i=n;i>=0;i--){     
          for(int j=n-i;j>=0;j--){
              int k = n-i-j;
              int number = 10000 * i + 5000 * j + 1000 * k;
              if(number == y && i + j + k == n){
              	 a = i;
                 b = j;
                 c = k;
                 flag = true;
                
              
            }
          }
         }
    if(flag){
      System.out.println(a +" "+ b +" "+ c);
    }else{
      System.out.println("-1" + " " + "-1" + " " + "-1");
    }  
  }
}  