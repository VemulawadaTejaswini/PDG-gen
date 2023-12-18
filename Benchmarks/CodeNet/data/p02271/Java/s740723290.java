import java.util.Scanner;

//全部の場合を考慮すればN項の数列に関して2^N-1回の思考が必要だとわかるため、それを利用する。

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();  //与えられる数列の項数を入力
    int power=(int)Math.pow(2,n)/1;  //2^Nの計算をする(intに直す)
    int sum;
    String binary;
    int array[]=new int[n];  //10進数を2進数に変換した場合の1or0を格納する配列
    int array1[]=new int[n];  //与えられた数列の各項の値を格納する配列
    for(int i=0;i<n;i++){
      array1[i]=sc.nextInt();  //入力で与えられる数列の各項の値を配列に格納
    }
    int q=sc.nextInt();  //問題として与えられる数値の個数を入力
    int answer[]=new int[q];  //答えが出るか(yesかnoか)を数字として控えておく配列
    int array2[]=new int[q];  //問題として与えられる数値を格納する配列
    for(int i=0;i<q;i++){
      array2[i]=sc.nextInt();  //入力で与えられる問題の各数値を配列に格納
      answer[i]=0;  //あらかじめ全ての数字が作れなかった(noだった)と仮定して格納
    }
    for(int i=0;i<power-1;i++){
      sum=0;  //数列の和を控えておく変数
      binary=Integer.toBinaryString(i+1+power);  //10進数の1+2^N～2^(N+1)-1を2進数に変換
      for(int j=0;j<n;j++){
        if(binary.charAt(j+1)=='0') array[j]=0;
        else if(binary.charAt(j+1)=='1') array[j]=1;
        //上述の範囲設定<1+2^N～2^(N+1)-1>はN+1桁の2進数として保存しておき下N桁を切り取るため
      }
      for(int j=0;j<n;j++){
        sum+=(array[j]*array1[j]);  //array[]の要素は0か1のみなのでこれは足すorNotを意味する
        for(int k=0;k<q;k++){
          if(array2[k]==sum)answer[k]=1;  //ここで和と問題を比較し,正解(yes)なら1を控える
        }
      }
    }
    for(int i=0;i<q;i++){
      if(answer[i]==1) System.out.println("yes");  //結果を控える配列の数字に応じて
      else System.out.println("no");               //yes or no を出力する
    }
    sc.close();
  }
}
