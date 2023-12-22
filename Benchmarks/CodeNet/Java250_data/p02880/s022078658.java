import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int a = 0;
    
    for(int i=1;i<=9;i++){
      for(int j=1;j<=9;j++){
        if(i*j==num){
          a =1;
          break;
        }
      }
    }
    
    if(a==0){
    	System.out.println("No");
    }
    else{
      System.out.println("Yes");
    }
    
  }
}
