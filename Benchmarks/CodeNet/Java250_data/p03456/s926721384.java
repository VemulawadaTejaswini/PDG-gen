import java.util.*;

public class Main{
  public static int digit(int x){
    int ans = 0, tmp = x;
    if(x == 0)return 1;
    while(tmp != 0){
      tmp /= 10;
      ++ans;
    }
    return ans;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    sc.close();
    String ans[] = {"Yes", "No"};
    int an = 1, tmpa = a, tmpb = b;
    int d = digit(tmpb);
    tmpa *= (int)Math.pow(10, d);
    tmpa += tmpb;
    tmpb = (int)Math.sqrt(tmpa);
    if(tmpa == tmpb * tmpb)an = 0;
    System.out.println(ans[an]);
  }
  
}