
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    String S = sc.next();
    int n = S.length();
    String tmp="R";
    int size[] =new int[n];
    int bound[] =new int[n];
    int cntR[] =new int[n];
    int cntL[] =new int[n];
    int tmpsize=0;
    int tmpcntR=0;
    int tmpcntL=0;
    int cntBlock=0;
    int ans[] = new int[n];
    //RR..RL....Lのブロックを集めて大きさと境界の場所とRの数とLの数を管理する
    
    for(int i=0;i<S.length();i++){
      if(tmp.equals(S.substring(i,i+1))){
        tmpsize++;
        if(tmp.equals("R")){
          tmpcntR++;
        }else{
          tmpcntL++;
        }
      }else if(tmp.equals("R")){
        tmpsize++;
        bound[cntBlock]=i;
        tmpcntL++;
        tmp="L";
      }else{
        cntR[cntBlock]=tmpcntR;
        cntL[cntBlock]=tmpcntL;
        size[cntBlock]=tmpsize;
        cntBlock++;
        tmpsize=1;
        tmpcntR=1;
        tmpcntL=0;
        tmp="R";
      }
    }
    cntR[cntBlock]=tmpcntR;
    cntL[cntBlock]=tmpcntL;
    size[cntBlock]=tmpsize;

    for(int i=0;i<n;i++){
      ans[i]=0;
    }
    for(int i=0;i<=cntBlock;i++){
      ans[bound[i]-1]=(cntL[i]/2)+((cntR[i]+1)/2);
      ans[bound[i]]=size[i]-ans[bound[i]-1];
    }
    for(int i=0;i<n;i++){
      System.out.print(ans[i]);
      System.out.print(" ");
    }




  }
  

  
}
