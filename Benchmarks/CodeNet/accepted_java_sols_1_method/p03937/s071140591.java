import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] aisle = new int[h+1][w+1];
    for(int i = 0;i<h;i++){
      String s = sc.next();
      char[] c = s.toCharArray();
      for(int j = 0;j<w;j++){
        if(c[j]=='#')aisle[i][j]=1;
      }
    }
    boolean ans = true;
    int nowh = 0,noww = 0;
    while(nowh<h && noww<w){
      if(nowh==h-1&&noww==w-1)break;
      if(aisle[nowh][noww+1]==0&&aisle[nowh+1][noww]==0 || aisle[nowh][noww+1]==1&&aisle[nowh+1][noww]==1){
        ans = false;
        break;
      }
      if(aisle[nowh][noww+1]==1){
        aisle[nowh][noww]=0;
        for(int i = 0;i<h;i++){
          if(aisle[i][noww]==1){
            ans = false;
            break;
          }
        }
        noww++;
      }
      if(aisle[nowh+1][noww]==1){
        aisle[nowh][noww]=0;
        for(int i = 0;i<w;i++){
          if(aisle[nowh][i]==1){
            ans = false;
            break;
          }
        }
        nowh++;
      }
    }

    if(ans){
      System.out.println("Possible");
    }else{
      System.out.println("Impossible");
    }
  }
}
