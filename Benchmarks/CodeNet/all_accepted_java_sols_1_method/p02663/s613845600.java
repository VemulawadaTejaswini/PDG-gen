import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H1 =sc.nextInt();
    int M1 =sc.nextInt();
    int H2 =sc.nextInt();
    int M2 =sc.nextInt();
    int K =sc.nextInt();
    int l =K/60;
    int m =K%60;
    H2=H2-l;
    M2=M2-m;
    if(M2<0){M2=M2+60;H2=H2-1;}
    int H3 =H2-H1;
    int M3 =M2-M1;
    int ans =H3*60+M3;
    System.out.println(ans);
  }
}