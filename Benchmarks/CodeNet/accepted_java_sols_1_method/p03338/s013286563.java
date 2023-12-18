import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //長さ
    int n = sc.nextInt();
    //文字列
    String s = sc.next();
    //アスキーコード用変数
    int num = 0;
    //アスキーコード用配列左側
    int asl[] = new int [26];
    //アスキーコード用配列右側
    int asr[] = new int [26];
    //区切った後の左側の文字列
    String strl;
    //区切った後の右側の文字列
	String strr;
    //最大数用
    int max = 0;
    //カウント用
    int count = 0;
    

    
    //区切ってく
    for(int j = 1; j<n; ++j){
          //配列の中身を0で初期化
    	for(int i = 0; i<26; ++i){
      		asl[i] = 0;
      		asr[i] = 0;
    	}
      //左
      strl = s.substring(0,j);
      //右
      strr = s.substring(j,n);
    
    //左側
    for(int i = 0 ; i < strl.length() ; ++i){
      //アスキーコードを0スタートで数える
      num = (int)strl.charAt(i) - 97;//aだったら0になる
      //文字列にあるコードは1にしておく
      asl[num] =1;
    }
    //右側
    for(int i = 0 ; i < strr.length() ; ++i){
      //アスキーコードを0スタートで数える
      num = (int)strr.charAt(i) - 97;//aだったら0になる
      //文字列にあるコードは1にしておく
      asr[num] =1;
    }
      //両側にあるかチェック
    for(int i = 0 ; i < 26 ; ++i){
      //両方あったら
      if((asl[i] ==1) && (asr[i] == 1)){
        
        //カウント増やす
        count+=1;
        
      }
  
    }
      //カウントの方が大きくなったら更新する
      if(max < count){
        max = count;
      }
      
    count = 0;
      
    }
   System.out.println(max);
  }
}