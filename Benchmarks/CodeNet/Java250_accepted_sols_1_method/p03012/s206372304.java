import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    /*
        入力
    */

    int n=sc.nextInt();
    int w[]=new int[n];

    for(int i=0;i<n;i++){
      w[i]=sc.nextInt();
    }

    /*
        必要な変数
    */

    int total=0;
    double chuo;
    int s11=0;
    int s21=0;
    int s12=0;
    int s22=0;
    int k=0;

    /*
        全体の和を２分の１したもの
    */

    for(int i=0;i<n;i++){
      total+=w[i];
    }
    chuo=total/2;

    /*
        もしchuoの値を超えたら前後のiを記録する
    */

    total=0;

    for(int i=0;i<n;i++){
      total+=w[i];
      if(total>=chuo){
        k=i;
        break;
      }
    }

    /*
        二つの場合を試す
    */

    for(int i=0;i<k;i++){
      s11+=w[i];
    }
    for(int i=k;i<n;i++){
      s21+=w[i];
    }
    for(int i=0;i<k+1;i++){
      s12+=w[i];
    }
    for(int i=k+1;i<n;i++){
      s22+=w[i];
    }


    if(Math.abs(s11-s21)>=Math.abs(s12-s22)){
      System.out.println(Math.abs(s12-s22));
    }else{
      System.out.println(Math.abs(s11-s21));
    }

  }
}
