import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int Q = Integer.parseInt(sc.next());
    int[] ans = new int[N];
    for(int i=0;i<Q;i++){
      ans[Integer.parseInt(sc.next())-1]++;
    }
    StringBuilder sb = new StringBuilder();
   
    for(int i=0;i<N;i++){
      if((K-(Q-ans[i]))>0){
        sb.append("Yes\n");
      }else{
        sb.append("No\n");
      }
    }
    System.out.print(sb.toString());
    System.out.flush();
  }
}