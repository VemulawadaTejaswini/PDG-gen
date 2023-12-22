import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int answer =0;
    for(int i=A;i<=B;i++){
      if(isParin(i)){
        answer++;
      }
    }
    System.out.println(answer);
  }
  
  public static boolean isParin(int n){
    boolean res=false;
    if(n/10000==n%10&&(n/1000)%10==(n/10)%10){
      return true;
    }
    return res;
  }
  

  
}