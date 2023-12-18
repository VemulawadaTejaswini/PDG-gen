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
    int[][] box=new int[N][2];

    int x=0;
    box[0][0]=A[0];
    box[0][1]=1;
    for(int i=1;i<N;i++){
      if(A[i-1]==A[i]){
        box[x][1]+=1;
      }
      else{
        x+=1;
        box[x][0]=A[i];
        box[x][1]=1;
      }
    }


	for(int i=0;i<Q;i++){
      double ans=0;
      for(int k=0;k<N;k++){
        if(BC[i][0]==box[k][0]){
          box[k][0]=BC[i][1];
        }
      }

     for(int j=0;j<N;j++){
       ans+=((box[j][0])*(box[j][1]));
     }
     System.out.println(String.format("%.0f", ans));
    }

  }  
}