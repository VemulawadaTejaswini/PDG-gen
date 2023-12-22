import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    while(true){
      if(x>y){
        while(x>y) x=x-y;
      }else if(x<y){
        while(y>x) y=y-x;
      }else{
        break;
      }
    }
    System.out.println(x);
  }
}

