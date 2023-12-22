import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int distanse = Y-X;//ショートしなかった場合の距離
    int mindist[][]=new int[N+1][N+1];
    int ans[] = new int[N];
    for(int i=1;i<=N;i++){
      for(int j=i+1;j<=N;j++){
        if(i<=X&&j>=Y){//完全にまたいでいるとき
          mindist[i][j]=j-i-distanse+1;
          ans[mindist[i][j]]++;
        }else if(i>=X&&j<=Y){//両方ショートカットの中に入っているとき
          mindist[i][j]=Math.min(j-i,i-X+1+(Y-j));//中からたどるか外からたどるか早いほう
                    ans[mindist[i][j]]++;
        }else if(i>=X&&j>=Y&&i<=Y){//iがショートカットの中に入っているとき
          mindist[i][j]=Math.min(i-X+1+(j-Y),j-i);//中からたどるか外から...
                    ans[mindist[i][j]]++;
        }else if(j<=X||i>=Y){//ショートカット関係ないとき
          mindist[i][j]=j-i;
                    ans[mindist[i][j]]++;
        }else if(i<X&&j>=X&&j<=Y){//jがショートカットの中に入っているとき
          mindist[i][j]=Math.min(X-i+1+Y-j,j-i);//同上
                    ans[mindist[i][j]]++;
        }else{
        }
      }
    }
//    for(int i=0;i<N;i++){
//      for(int j=0;j<N;j++){
//        System.out.print(mindist[i][j]);
//        System.out.print(" ");
//      }
//      System.out.println("");
//    }
    
    for(int k=1;k<=N-1;k++){
     System.out.println(ans[k]);
    }
  }
  

  
}