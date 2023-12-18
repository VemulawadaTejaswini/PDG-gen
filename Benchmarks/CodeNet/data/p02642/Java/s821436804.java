import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] List=new int[N];
    for(int i=0;i<N;i++) List[i]=s.nextInt();

    int ans=0;
    for(int i=0;i<N;i++){
      for(int j=i+1;j<N;j++){
        if(List[i]%List[j]==0) break;
      	if(j==N-1) ans+=1;
      }

    }
    System.out.println(ans);
  }  
}