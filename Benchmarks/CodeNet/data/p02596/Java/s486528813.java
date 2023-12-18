import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int k = sc.nextInt();
    
    int[] list = {0,7,0,9,0,0,0,1,0,3};
    
    if(list[k%10] == 0){
      System.out.println("-1");
      return;
    }
    
    int size = String.valueOf(k).length();
    int kk = 0;
    int base = k%10;
    int g = list[base];
    int sum = 0;
    for(int i=0; i < size; i++){
      kk = k * g;
      sum += kk * 10^i;
      
      int next = 7 - (kk/10)%10;
      
      for(int j = 1; j < 10; j++){
        if((j * base)%10 == next){
          g = j;
          break;
        } else if(j == 9){
          System.out.println("-1");
          return;
        }
      }
    }
    
    System.out.println(sum);
    
    String kkk = String.valueOf(sum);
    for(int i=0; i < kkk.length(); i++){
      if(!kkk.substring(i, 1).equals("7")){
	    System.out.println("-1");
        return;
      }
    }
    
    System.out.println(kkk.length());
  }
}
