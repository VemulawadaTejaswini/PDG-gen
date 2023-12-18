import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    	int c = sc.nextInt();
    	int k = sc.nextInt();
    	int i = 0;
    
    while(i<=k){
      if(b > a &&c > b){
        break;
      }
      while(b < a){
        b*=2;
        i++;
      }
      while(c<b){
        c*=2;
        i++;
      }
 
    }
    if(i <= k){
		System.out.println("Yes");
      }else{
    System.out.println("No");
    }


  }
}