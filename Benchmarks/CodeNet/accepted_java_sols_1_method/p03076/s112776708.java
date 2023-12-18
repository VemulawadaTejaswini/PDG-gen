import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int [] ary = new int[5];
    int min = 130;
    int mini = 16;
    for(int i=0; i<5; ++i) {
      ary[i] = sc.nextInt();
      if(ary[i]%10<min & ary[i]%10 !=0) {
        min=ary[i]%10;
        mini = i;
      }
    }
    if(mini!=16) {
      int w = ary[4];
      ary[4] = ary[mini];
      ary[mini] = w;
    }

    int ans =0;
    for(int i=0; i<5; ++i) {
      ans += ary[i];
      if(i<4 & ans % 10 != 0) {
        ans = (ans+10)/10 * 10;
      }
    }
      System.out.println(ans);
  }
}