import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt(),d = sc.nextInt();
    int result= a+b-c-d;
    if(result>0){
      System.out.println("Left");
    }else if(result==0){
      System.out.println("Balanced");
    }else{
      System.out.println("Right");
    }
  }
}
