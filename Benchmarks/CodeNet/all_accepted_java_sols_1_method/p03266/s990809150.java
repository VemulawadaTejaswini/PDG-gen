import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int N = Integer.parseInt(S[0]);
    int K = Integer.parseInt(S[1]);
    
    long ans1 = 0;
    long ans2 = 0;
    for(int i = 1; i <= N; i++){
      if(K%2 == 0){
        if(i%K == 0){
          ans1++;
        }else if(i%K == K/2){
          ans2++;
        }
      }else if(K%2 != 0 && i%K == 0){
        ans2++;
      }
    }
    ans1 = ans1*ans1*ans1;
    ans2 = ans2*ans2*ans2;
    System.out.println(ans1+ans2);
  }
}