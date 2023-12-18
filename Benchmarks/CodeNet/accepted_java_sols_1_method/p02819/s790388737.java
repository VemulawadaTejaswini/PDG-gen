import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x==1){
      System.out.println(2);
      System.exit(0);
    }
    if(x==2){
      System.out.println(2);
      System.exit(0);
    }
    if(x%2==0){
      x +=1;
    }

    while(true){
      int count = 0;

      for(int i=3; i<x;i+=2){
        if(x%i==0){
          count += 1;
        }
      }
      if(count==0){
        break;
      }else{
        x +=2;
      }
    }
    System.out.println(x);


  }
}