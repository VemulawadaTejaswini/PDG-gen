import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int x=sc.nextInt(),y=sc.nextInt(),a,b,f=0;
    if(y%2!=0){
      System.out.println("No");
    }else{
      for(int i=0;i<=x;i++){
        a=i;
        b=x-i;
        
        if((2*a+4*b)==y){
          System.out.println("Yes");
          f++;
          break;
        }
      }
      if(f==0){
        System.out.println("No");
      }
    }
  }
}
