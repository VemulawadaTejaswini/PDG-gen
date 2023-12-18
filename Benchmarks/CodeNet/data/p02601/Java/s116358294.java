import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt(),f=0;
    while(f<k){
      if(b<=a){
        b*=2;
        f++;
      }else if(c<=b){
        c*=2;
        f++;
      }else{
        break;
      }
    }
    if(f<k||(b>a&&c>b)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
