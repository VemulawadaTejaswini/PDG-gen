import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int Sum = l;
    
    if(l>=0){
      Sum = 0;
      for(int i=1;i<n;i++){
        Sum += l+i;
      }
    }else{
      if(n+l > 0){
        for(int i=1;i<n;i++){
          Sum += l+i;
        }
      }else{
        for(int i=1;i<n-1;i++){
        	Sum += l+i;
      	}
      }
    }
    System.out.println(Sum);
  }
}