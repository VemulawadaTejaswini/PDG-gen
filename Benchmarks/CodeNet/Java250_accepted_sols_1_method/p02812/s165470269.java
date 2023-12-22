import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
	int ans = 0;
    for (int i=0;(i+3) <= N;i++){
//      System.out.println("i" + i);
//      System.out.println(S.substring(i,(i+3)));
      if(S.substring(i,(i+3)).equals("ABC")){
        ans++;
      }
    }
    System.out.println(ans);
  }
}