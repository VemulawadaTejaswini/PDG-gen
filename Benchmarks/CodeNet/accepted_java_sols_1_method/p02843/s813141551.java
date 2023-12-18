import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);   
    // 持ち金
    int X = sc.nextInt();
    //100で割った商（買える個数）
    int count = X/100;
    //100で割ったあまり
    int A = X%100;
    //端数は買い物回数以内で合わせられるか
    for(int i=0;i<count;i++){
        if(A>=5){
          A=A-5;
        }else if(A>=4){
          A=A-4;
        }else if(A>=3){
          A=A-3;
        }else if(A>=2){
          A=A-2;
        }else if(A>=1){
          A=A-1;
        }
    }
      if(A==0){
        System.out.println(1);
      }else{
        System.out.println(0);
      }
  }
}