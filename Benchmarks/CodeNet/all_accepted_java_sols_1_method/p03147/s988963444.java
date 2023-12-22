import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int count = 0;
    int now = 0;
    for(int i = 0; i < N; i++){
      int n = Integer.parseInt(S[i]);
      if(n > now){
        count += n-now;
        now = n;
      }else{
        now = n;
      }
    }
    System.out.println(count);
  }
}