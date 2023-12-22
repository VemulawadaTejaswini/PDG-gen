import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String judge = "OK";
    int N = sc.nextInt();
    for(int i = 0;i < N;i++){
      int A = sc.nextInt();

      if(A % 2 == 0){
        if(A % 3 == 0){
          judge = "OK";
        }else if(A % 5 == 0){
          judge = "OK";
        }else {
          judge = "NG";
          break;
        }
      }
    }
    if(judge == "OK"){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");}
  }
}