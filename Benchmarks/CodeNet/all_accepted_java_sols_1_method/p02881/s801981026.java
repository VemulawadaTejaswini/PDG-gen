import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    long ans = Long.MAX_VALUE;
    for(long i=1; i < Math.sqrt(N)+1; i++){
      if(N%i==0){
        ans = Math.min((N/i)+i-2,ans);
      }
    }
    System.out.print(ans);
    return;
  }
}

