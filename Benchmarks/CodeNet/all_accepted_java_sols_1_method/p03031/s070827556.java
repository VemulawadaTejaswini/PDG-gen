import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int s[][]= new int[M][N];
    int tmp=0;
    int p[] = new int[M];
    for(int i=0;i<M;i++){
      tmp=sc.nextInt();
      for(int j=0;j<tmp;j++){
        s[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<M;i++){
      p[i]=sc.nextInt();
    }
    int answer =0;
    int tmps=0;
    boolean allRight=true;
    boolean r[] = new boolean[M];
    for(int i=0;i<M;i++){
      r[i]=false;
    }
    for(int i=0;i<(1<<N);i++){
      for(int j=0;j<M;j++){
        for(int k=0;k<N;k++){
          if((i>>s[j][k])%2==1){//s[j][k]のスイッチが今おささってるか判定
            tmps++;
          }
        }
        if(tmps%2==p[j]){//j番目の電球はOK
          r[j]=true;
          tmps=0;
        }
      }
      //電球なめて全部光ってたら答えをインクリメント
      for(int l=0;l<M;l++){
        if(!r[l]){
          allRight=false;
          break;
        }
      }
 //     System.out.println(i);
 //     System.out.println(allRight);
      if(allRight){
      answer++;
      }
      allRight=true;
      for(int m=0;m<M;m++){//それぞれ初期値に戻す
        r[m]=false;
      }
      tmps=0;
    }

    System.out.println(answer);
  }
  


  
}
