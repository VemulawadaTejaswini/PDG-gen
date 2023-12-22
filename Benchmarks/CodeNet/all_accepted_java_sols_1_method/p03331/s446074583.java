import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    if(N%10==0){
      System.out.println(10);
    }else{
      String nStr = Integer.toString(N);
      int ans = 0;
      for(int i=0;i<nStr.length();i++){
        int n = Integer.parseInt(nStr.substring(i,i+1));
        ans+=n;
      }
      System.out.println(ans);
    }
  }
}