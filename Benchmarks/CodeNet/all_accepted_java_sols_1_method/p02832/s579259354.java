import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] bricknumber=new int[N];
    int[] index=new int[N+2];//iのあったbricknumberのindex
    int[] check=new int[N+2];
    int last=N;
    
    for(int h=0;h<N;h++){
      bricknumber[h]=sc.nextInt();
    }
    
    check[1]=0;//check[i]はi－1番目の数を見つけたインデックス。そこからiを探し始める
    for(int k=0;k<=N;k++){
      index[k]=-1;
    }
    
    for(int i=1;i<=N;i++){
      for(int j=check[i];j<N;j++){
        if(bricknumber[j]==i){
          index[i]=j;
          check[i+1]=j;
          break;
        }
      }
      if(index[i]==-1){
        last=i-1;
        break;
      }
      
    }
    if(last==0){
      last=N+1;
    }
    
    System.out.println(N-last);
    
  }
}