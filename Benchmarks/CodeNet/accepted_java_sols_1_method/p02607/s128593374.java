import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] ai=new int[N];
    for(int i=0;i<N;i++)ai[i]=s.nextInt();
    int ans=0;
    for(int i=0;i<N;i+=2){
      if(ai[i]%2==1) ans+=1;
    }
    System.out.println(ans);

  }  
}