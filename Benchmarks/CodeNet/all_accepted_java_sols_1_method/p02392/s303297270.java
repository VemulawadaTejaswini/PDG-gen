import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int in1 = scanner.nextInt();
    int in2 = scanner.nextInt();
    int in3 = scanner.nextInt();

    if(in1<in2){
      if(in2<in3){
        System.out.println("Yes");
      }else{System.out.println("No");}
    }else{System.out.println("No");}
  }
}