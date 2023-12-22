import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
    int ans = 0;
    for (int i=1;H>0;i++){
      H -= A;
      ans = i;
    }
    System.out.println(ans);
  }
}
