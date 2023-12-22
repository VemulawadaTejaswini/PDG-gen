import java.util.*;
public class Main{
  public static void main(String[] args) {
    //入力
    Scanner sc = new Scanner(System.in);
//全体の個数
long N =sc.nextLong();
//Aは青の個数
long A =sc.nextLong();
//Bは赤の個数
long B =sc.nextLong();
//カウント変数
long cnt = 0;
//青と赤のセットの数
long set = (long)(N/(A+B));
cnt = set*A;
if(N%(A+B) == 0){
  System.out.println(cnt);
}else{
  //セットを並べたときの個数
  long ball =set*(A+B);
  if(N-ball >= A){
    System.out.println(cnt+A);
  }else{
    System.out.println(cnt+(N-ball));
  }
  
}

}

}
