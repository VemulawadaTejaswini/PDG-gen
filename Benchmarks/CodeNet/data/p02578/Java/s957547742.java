import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int ans=0;
    int max=0;
    for(int i=0;i<N;i++){
      int height=s.nextInt();
      if(height<=max) ans+=max-height;
      else max=height;
    }
    System.out.println(ans);
    
  }  
}