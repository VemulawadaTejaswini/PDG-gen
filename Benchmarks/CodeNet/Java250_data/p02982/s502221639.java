import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x[][] = new int[n][d];
    int dist2 =0;
    int answer =0;
    for(int i=0;i<n;i++){
      for(int j=0;j<d;j++){
        x[i][j]=sc.nextInt();
      }
    }
    
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        dist2=0;
        for(int k=0;k<d;k++){
          dist2 = dist2+(x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
        }
        if(isSq(dist2)){
          answer = answer+1;
        }
      }
    }
        
    System.out.println(answer);
       
  }
  
  public static boolean isSq(int N){
    for(int i=0;i<=N;i++){
      if(i*i==N){
        return true;
      }
    }
    return false;
  }
  

  
}