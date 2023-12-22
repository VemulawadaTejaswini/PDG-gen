import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws IOException{
    Scanner scan=new Scanner(System.in);

    while(true){
      int n=Integer.parseInt(scan.next());
      int x=Integer.parseInt(scan.next());
      int count=0;
      if(n==0 && x==0)break;
      //1~nまでループするiをつかってx-iを計算して,残りをi+1~nの範囲でx-iになる数2こを探す
      for(int i=1;i<=n;i++){
        int dis=x-i;
        for(int j=i+1;j<=n;j++){
          for(int k=j+1;k<=n;k++){
            if((dis-j-k)==0){
              count++;
            }
          }
        }
      }
      System.out.println(count);
    }
  }
}
