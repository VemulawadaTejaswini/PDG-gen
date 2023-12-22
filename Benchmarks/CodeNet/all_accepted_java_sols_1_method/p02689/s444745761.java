import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int M=s.nextInt();
    int[] height=new int[N];
    int [][] pair=new int[M][2];
    for(int i=0;i<N;i++) height[i]=s.nextInt();
    for(int i=0;i<M;i++) for(int j=0;j<2;j++) pair[i][j]=s.nextInt();    
    boolean[] ansBox=new boolean[N];
    for(int i=0;i<N;i++) ansBox[i]=true; 
    
    for(int i=0;i<M;i++){
      if(height[pair[i][0]-1]<=height[pair[i][1]-1]) ansBox[pair[i][0]-1]=false;
      if(height[pair[i][1]-1]<=height[pair[i][0]-1]) ansBox[pair[i][1]-1]=false;
    }
	int ans=0;
    for(int i=0;i<N;i++) if(ansBox[i]==true) ans+=1;

    System.out.println(ans);
  }  
}