import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int[] A=new int[N];
    for(int i=0;i<N;i++) A[i]=s.nextInt();
    int Q=s.nextInt();
    int[][] BC=new int[Q][2];
    for(int i=0;i<Q;i++) for(int j=0;j<2;j++) BC[i][j]=s.nextInt();
    Arrays.sort(A);
    int[] List=new int[A[N-1]+1];
    for(int i=0;i<List.length;i++)List[i]=0;
    for(int i=0;i<N;i++)List[A[i]]+=1;
    int[][] box=new int[N][2];
    for(int i=0;i<N;i++) for(int j=0;j<2;j++) box[i][j]=0;
    int x=0;
    for(int i=0;i<List.length;i++){
      if(List[i]!=0){
        box[x][0]=i;
        box[x][1]=List[i];
        x+=1;
      }
    }


	for(int i=0;i<Q;i++){
      double ans=0;
      for(int k=0;k<x;k++){
        if(BC[i][0]==box[k][0]){
          box[k][0]=BC[i][1];
          break;
        }
      }
     for(int j=0;j<x;j++){
       ans+=box[j][0]*box[j][1];
     }
     System.out.println(String.format("%.0f", ans));
    }

  }  
}