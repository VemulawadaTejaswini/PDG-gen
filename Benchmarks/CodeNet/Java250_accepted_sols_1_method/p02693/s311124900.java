import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int A = sc.nextInt();
    int B = sc.nextInt();
    String ans = "NG";
    for(int i = A; i <= B; i++){
      if(i%N==0){
        ans = "OK";
        break;
      }
    }
    System.out.println(ans);
  }
}